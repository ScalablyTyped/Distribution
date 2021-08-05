organization := "org.scalablytyped"
name := "aws-sdk__region-provider"
version := "0.1.0-preview.1-b4a1d5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "1.0.0-rc.3-06814b",
  "org.scalablytyped" %%% "aws-sdk__types" % "1.0.0-rc.7-d8ebf5",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
