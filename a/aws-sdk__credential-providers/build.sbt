organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-c1d6be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.200.0-93be50",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.200.0-123e58",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.200.0-a87587",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.200.0-6a7f88",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.200.0-c103f2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.200.0-0c8cfc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.200.0-ed4a5b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.200.0-511f17",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.200.0-1e628f",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.200.0-529796",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.200.0-c487ec",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.200.0-eddabf",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.200.0-e96f0a",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.200.0-dab61b",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.200.0-afe384",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.200.0-7c670f",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.200.0-c40a2f",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.200.0-20abb3",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.200.0-ba75f2",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.200.0-2871d2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
