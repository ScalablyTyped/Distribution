organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-crt"
version := "3.208.0-03434d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-crt" % "1.14.7-b16ea4",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-73cef6",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-f19ef1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
