organization := "org.scalablytyped"
name := "aws-sdk__credential-providers"
version := "3.332.0-40b42a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "3.332.0-b52065",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.332.0-b73267",
  "org.scalablytyped" %%% "aws-sdk__client-sts" % "3.332.0-61cd6d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-cognito-identity" % "3.332.0-5265d1",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.329.0-43a226",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.332.0-a6c85d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-node" % "3.332.0-6be41d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "3.329.0-bc6338",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.332.0-660bcd",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.329.0-843822",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.329.0-35fc6e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.329.0-065ce6",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.329.0-507793",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.329.0-a363ee",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.329.0-62d616",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.329.0-b8e882",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.329.0-caa31a",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.329.0-98a842",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.329.0-3ef5a2",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.332.0-7550bd",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
