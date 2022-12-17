organization := "org.scalablytyped"
name := "aws-sdk__config-resolver"
version := "3.209.0-bf8293"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.209.0-ffe07e",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-da3134",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-0df237",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
