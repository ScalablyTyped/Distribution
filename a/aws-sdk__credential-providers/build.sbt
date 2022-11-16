organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-fe12b8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.211.0-c59ec9",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.211.0-80dd3d",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.211.0-db5630",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.211.0-f6da21",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.209.0-8587df",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.211.0-8becbc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.211.0-131fc9",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.209.0-fe1334",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.211.0-20f70f",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.208.0-e6364a",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-093406",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-8e567e",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.209.0-a60587",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-5908cd",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-c41403",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-adb61e",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-bf3180",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-171412",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-b45120",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.211.0-22f38f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
