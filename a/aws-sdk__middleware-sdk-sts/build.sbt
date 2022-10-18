organization := "org.scalablytyped"
name := "aws-sdk__middleware-sdk-sts"
version := "3.190.0-2f40a7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__middleware-signing" % "3.190.0-b8786e",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.190.0-7ce92c",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.190.0-49d0ee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
