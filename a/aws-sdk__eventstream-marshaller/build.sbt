organization := "org.scalablytyped"
name := "aws-sdk__eventstream-marshaller"
version := "3.120.0-ba4dbe"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__eventstream-codec" % "3.171.0-bb1fda",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.178.0-507e2a",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
