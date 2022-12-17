organization := "org.scalablytyped"
name := "aws-sdk__client-cognito-identity"
version := "3.211.0-f60b75"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-b90a86",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-db38a1",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-8c416e",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-cf36c2",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-612f41",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-fa36aa",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-0df237",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.211.0-b4a0f7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
