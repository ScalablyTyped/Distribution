organization := "org.scalablytyped"
name := "broccoli-persistent-filter"
version := "3.1.3-7493c5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-e6dafa",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-0b9fdf",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-a140f2",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-61a6dc",
  "org.scalablytyped" %%% "fs-tree-diff" % "2.0.1-2beff4",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-e3e084")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
