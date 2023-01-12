organization := "org.scalablytyped"
name := "aws-sdk__util-create-request"
version := "3.209.0-dd1ca0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-97ce32",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-efa4e4",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-be5074",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
