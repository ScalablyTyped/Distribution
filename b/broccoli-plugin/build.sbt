organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.7-2b463e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-696199",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-44ed89",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-221b13",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-25b5f6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-4cf872")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
