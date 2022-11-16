organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20211202Z-bfc910"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-9d5136",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-d669c9",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-1a27b0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-b45c77",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-29b9b2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
