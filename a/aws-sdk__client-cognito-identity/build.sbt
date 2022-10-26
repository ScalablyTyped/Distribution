organization := "org.scalablytyped"
name := "aws-sdk__client-cognito-identity"
version := "3.196.0-c1af56"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.193.0-9b9a76",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.193.0-e866bc",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.193.0-b9bfb3",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.193.0-b1b88c",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.193.0-a1955c",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.193.0-88a6ea",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-e6a0eb",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.196.0-119f34",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
