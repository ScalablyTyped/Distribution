organization := "org.scalablytyped"
name := "aws-sdk__middleware-sdk-sts"
version := "3.200.0-472086"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__middleware-signing" % "3.200.0-67ab64",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.200.0-c40a2f",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.200.0-ba75f2",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
