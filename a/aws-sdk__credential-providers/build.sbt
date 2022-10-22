organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-4dde90"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.194.0-25fe36",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.193.0-76a59b",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.194.0-eb4b31",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.194.0-786bd7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.193.0-f2bf11",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.193.0-ea614f",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.193.0-cec3a2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.193.0-470585",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.193.0-91fc57",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.193.0-d36c3d",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.193.0-18c20e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.193.0-3948b6",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.193.0-f96a31",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.193.0-8c24f4",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.193.0-2a5acf",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.193.0-34ba1a",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.193.0-8cc493",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.193.0-4471ee",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-dc0323",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.194.0-ba4376",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
