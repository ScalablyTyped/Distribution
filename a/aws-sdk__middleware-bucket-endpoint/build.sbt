organization := "org.scalablytyped"
name := "aws-sdk__middleware-bucket-endpoint"
version := "3.209.0-175186"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__node-config-provider" % "3.329.0-507793",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.329.0-b8e882",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.329.0-3ef5a2",
  "org.scalablytyped" %%% "aws-sdk__util-arn-parser" % "3.208.0-025dd1",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
