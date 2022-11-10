organization := "org.scalablytyped"
name := "backbone_dot_paginator"
version := "2.0-dt-20221103Z-7ed3a8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-f0c22b",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-b865bf",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-d89e1b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-472b38")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
