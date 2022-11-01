organization := "org.scalablytyped"
name := "aws-sdk__middleware-bucket-endpoint"
version := "3.200.0-f7a3c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.200.0-e96f0a",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.200.0-7c670f",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.200.0-ba75f2",
  "org.scalablytyped" %%% "aws-sdk__util-arn-parser" % "3.188.0-5d6036",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
