organization := "org.scalablytyped"
name := "aws-sdk__client-cognito-identity"
version := "3.200.0-93be50"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.200.0-c487ec",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.200.0-eddabf",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.200.0-dab61b",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.200.0-afe384",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.200.0-c40a2f",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.200.0-20abb3",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.200.0-ba75f2",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.200.0-2871d2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
