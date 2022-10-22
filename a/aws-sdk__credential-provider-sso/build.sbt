organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-sso"
version := "3.193.0-91fc57"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sso" % "3.193.0-76a59b",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.193.0-18c20e",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.193.0-8c24f4",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.193.0-2a5acf",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.193.0-34ba1a",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.193.0-4471ee",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-dc0323",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
