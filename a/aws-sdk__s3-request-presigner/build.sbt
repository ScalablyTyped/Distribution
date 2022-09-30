organization := "org.scalablytyped"
name := "aws-sdk__s3-request-presigner"
version := "3.181.0-e7266f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.180.0-0e55ef",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.178.0-507e2a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
