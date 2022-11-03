organization := "org.scalablytyped"
name := "backbone_dot_paginator"
version := "2.0-dt-20221103Z-e08c46"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-2705ab",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-9d6f35",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-cfd9ff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-4f6e95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
