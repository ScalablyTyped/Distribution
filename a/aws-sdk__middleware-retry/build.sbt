organization := "org.scalablytyped"
name := "aws-sdk__middleware-retry"
version := "1.0.0-rc.7-2c2d62"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "1.0.0-rc.7-bef98f",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "1.0.0-rc.3-e9295b",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "1.0.0-rc.7-c24818",
  "org.scalablytyped" %%% "aws-sdk__types" % "1.0.0-rc.7-917262",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
