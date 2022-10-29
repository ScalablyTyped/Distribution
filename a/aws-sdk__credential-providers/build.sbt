organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-7e1099"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.199.0-99c0ab",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.199.0-9a67a8",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.199.0-30efbf",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.199.0-7bf92a",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.198.0-680517",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.199.0-694bc0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.199.0-58d9fc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.198.0-a48a80",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.199.0-a0f92d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.198.0-591abc",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.199.0-790c51",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.198.0-79b2ed",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.198.0-d577da",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.199.0-8dac0c",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.198.0-c1c5a3",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.198.0-bca63a",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.198.0-270c7e",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.198.0-e2ca71",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.198.0-a78f65",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.198.0-bc39e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
