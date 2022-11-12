organization := "org.scalablytyped"
name := "aws-sdk__client-sso-oidc"
version := "3.209.0-c0a7a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.208.0-5b733e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.208.0-140325",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.208.0-54d092",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.208.0-137956",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.209.0-7dd4f2",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-f19ef1",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.209.0-baa626",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
