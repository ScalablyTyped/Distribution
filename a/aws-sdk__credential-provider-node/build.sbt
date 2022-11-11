organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "3.208.0-e10984"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.208.0-43752b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.208.0-f80778",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.208.0-340e9b",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.208.0-855e17",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.208.0-50866b",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-5b733e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-140325",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.208.0-62bd6b",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-54d092",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-137956",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.208.0-64edc2",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.208.0-707075",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-f19ef1",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.208.0-c6269c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
