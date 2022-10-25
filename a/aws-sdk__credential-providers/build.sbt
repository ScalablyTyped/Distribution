organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-c08c79"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.195.0-62f72c",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.193.0-b1f6ed",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.194.0-1356e1",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.195.0-6a7f65",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.193.0-6a749b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.193.0-0bb9cc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.193.0-6054d3",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.193.0-4a326f",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.193.0-5e3bcd",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.193.0-f2076b",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.193.0-9b9a76",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.193.0-e866bc",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.193.0-a255bf",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.193.0-b9bfb3",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.193.0-b1b88c",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.193.0-20c810",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.193.0-a1955c",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.193.0-88a6ea",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-e6a0eb",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.194.0-d818f6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
