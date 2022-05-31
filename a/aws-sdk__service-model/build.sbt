organization := "org.scalablytyped"
name := "aws-sdk__service-model"
version := "0.1.0-preview.2-ae973d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__build-types" % "0.1.0-preview.1-7a960f",
  "org.scalablytyped" %%% "aws-sdk__types" % "1.0.0-rc.7-8199df",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
