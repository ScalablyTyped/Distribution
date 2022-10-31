organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "3.199.0-70fb14"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.199.0-e70873",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.198.0-f9b81a",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.199.0-694bc0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.199.0-76f867",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.198.0-591abc",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.199.0-790c51",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.198.0-79b2ed",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.198.0-9ae08d",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.199.0-480450",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.198.0-c1c5a3",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.198.0-bca63a",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.198.0-e2ca71",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.198.0-a78f65",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.198.0-bc39e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
