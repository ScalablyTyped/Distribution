organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "3.193.0-3566b4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.193.0-f2d043",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "3.193.0-493625",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "3.193.0-0bb9cc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-sso" % "3.193.0-d1e3bc",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.193.0-f2076b",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.193.0-9b9a76",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.193.0-5603fe",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.193.0-e6914d",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.193.0-b1b88c",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.193.0-20c810",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.193.0-88a6ea",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-e6a0eb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
