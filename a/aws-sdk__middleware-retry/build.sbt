organization := "org.scalablytyped"
name := "aws-sdk__middleware-retry"
version := "3.201.0-aaab13"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.201.0-700122",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.201.0-a14da3",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.201.0-c5e1b2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
