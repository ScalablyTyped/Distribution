organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-imds"
version := "3.209.0-055e44"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.209.0-599a8c",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-787bcd",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-be5074",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
