organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-79f85b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.211.0-e40026",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.211.0-13cef0",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.211.0-7163f7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.211.0-3a12b1",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.209.0-055e44",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.211.0-60acc8",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.211.0-10e0e7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.209.0-ea6646",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.211.0-5753c4",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.208.0-d2fe56",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-6e4820",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-b1b434",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.209.0-599a8c",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-207adb",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-97ce32",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-787bcd",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-30d600",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-efa4e4",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-be5074",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.211.0-406a29",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
