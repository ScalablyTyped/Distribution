organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-0ca7bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.209.0-e8d37a",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.209.0-c72dd5",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.209.0-7b2866",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.209.0-602fc5",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.209.0-0cab2d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.209.0-87a2d7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.209.0-eb4ce2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.209.0-f14ede",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.209.0-dbd898",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.208.0-50866b",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-5b733e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-140325",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.209.0-9ba2e9",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-54d092",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-137956",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-05f31a",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.208.0-73cef6",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-7dd4f2",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-f19ef1",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.209.0-baa626",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
