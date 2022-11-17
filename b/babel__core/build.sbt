organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20221107Z-bfbaa8"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-a5f5d8",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-88d706",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-4b071b",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-3986dd",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-a7b16d",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
