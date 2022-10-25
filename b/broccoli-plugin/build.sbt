organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.7-4e77b1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-78ff74",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-4f5f7b",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-6f93cf",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-f445f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
