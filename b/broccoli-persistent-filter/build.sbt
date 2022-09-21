organization := "org.scalablytyped"
name := "broccoli-persistent-filter"
version := "3.1.3-cd5c4a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-3b81ac",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-604603",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-26d6ba",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-1d62d6",
  "org.scalablytyped" %%% "fs-tree-diff" % "2.0.1-a5a76d",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-a8ea5b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-e3fc55")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
