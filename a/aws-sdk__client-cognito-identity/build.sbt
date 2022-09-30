organization := "org.scalablytyped"
name := "aws-sdk__client-cognito-identity"
version := "3.181.0-de0ae2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.178.0-606942",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.178.0-9f80cd",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.178.0-9e83c7",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.178.0-f2ef9c",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.180.0-0e55ef",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.178.0-507e2a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
