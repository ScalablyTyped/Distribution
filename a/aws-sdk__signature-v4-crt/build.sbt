organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-crt"
version := "3.180.0-37eadd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-crt" % "1.14.4-df3ddb",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.178.0-f2ef9c",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.178.0-507e2a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
