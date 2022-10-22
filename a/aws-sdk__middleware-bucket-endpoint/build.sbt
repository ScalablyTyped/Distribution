organization := "org.scalablytyped"
name := "aws-sdk__middleware-bucket-endpoint"
version := "3.193.0-b85cc0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.193.0-f96a31",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.193.0-34ba1a",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-dc0323",
  "org.scalablytyped" %%% "aws-sdk__util-arn-parser" % "3.188.0-b981c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
