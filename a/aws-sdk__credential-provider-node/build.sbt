organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "3.197.0-3f6496"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.197.0-5b2e15",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.197.0-b1a5db",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.197.0-f403a7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.197.0-693d19",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.197.0-d29d15",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.197.0-59c277",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.197.0-19d02c",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.197.0-1b59e0",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.197.0-55f5a5",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.197.0-13f715",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.197.0-8cac7c",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.197.0-0afe85",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.197.0-ef10cd",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.197.0-7b13bb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
