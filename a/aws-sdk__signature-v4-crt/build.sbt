organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-crt"
version := "3.208.0-16bc7c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-crt" % "1.14.7-033861",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-bf3180",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-b45120",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
