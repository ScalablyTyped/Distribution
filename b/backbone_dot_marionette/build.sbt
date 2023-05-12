organization := "org.scalablytyped"
name := "backbone_dot_marionette"
version := "3.3-dt-20221230Z-adfab4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-d8a832",
  "org.scalablytyped" %%% "backbone_dot_radio" % "0.8-dt-20221103Z-81792b",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-60047c",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-227892",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20221230Z-78d9c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
