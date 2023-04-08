package com.course;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product myProduct = new Product("keyboard");
        System.out.printf(myProduct.getName());
    }
}