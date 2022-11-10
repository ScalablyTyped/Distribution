organization := "org.scalablytyped"
name := "aws-sdk__util-create-request"
version := "3.201.0-836833"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.201.0-26c475",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.201.0-b50391",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.201.0-c5e1b2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
