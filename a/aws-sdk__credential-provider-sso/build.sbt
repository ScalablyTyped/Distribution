organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-sso"
version := "3.204.0-ef371e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.204.0-ddff8e",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.204.0-50ba81",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.201.0-5e68af",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.201.0-12889c",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.201.0-26c475",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.201.0-a14da3",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.201.0-b50391",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.201.0-c5e1b2",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.202.0-d8689b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
