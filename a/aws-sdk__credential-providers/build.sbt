organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.192.0-bb91a3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.192.0-d86c22",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.190.0-f01692",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.192.0-b724b7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.192.0-6625bf",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.190.0-36a90c",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.190.0-1974d7",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.190.0-b6ff6b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.190.0-c27c77",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.190.0-05d465",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.190.0-e2dfd9",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.190.0-893e15",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.190.0-29948d",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.190.0-db1433",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.190.0-57f098",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.190.0-65cff8",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.190.0-7ce92c",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.190.0-28a167",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.190.0-49d0ee",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
