organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-24f969"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.201.0-6d5800",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.201.0-fba5de",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.201.0-1827c5",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.201.0-3e20f3",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.201.0-da94ca",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.201.0-6077ca",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.201.0-3175fe",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.201.0-0bfaa3",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.201.0-e4586b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.201.0-7fc635",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.201.0-5cf045",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.201.0-ddb507",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.201.0-3b3c90",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.201.0-ae6d59",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.201.0-152889",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.201.0-79f6f4",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.201.0-e72523",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.201.0-10c32c",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.201.0-360262",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.201.0-86f177",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
