package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.printf("==게시판 앱==\n");
        while(true) {
            System.out.print("명령)");
            String command =sc.nextLine().trim();

            if (command.equals("종료")) {
                System.out.println("종료 됩니다");
                break;

            }
        }
         sc.close();
        }

}