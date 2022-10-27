organization := "org.scalablytyped"
name := "broccoli-persistent-filter"
version := "3.1.3-cad633"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-78ff74",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-995398",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-3ba65a",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-c1d6ed",
  "org.scalablytyped" %%% "fs-tree-diff" % "2.0.1-700255",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-09971c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
