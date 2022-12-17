organization := "org.scalablytyped"
name := "broccoli-persistent-filter"
version := "3.1.3-96ac80"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-eeb3b6",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-8565b1",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-50b870",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-20df2c",
  "org.scalablytyped" %%% "fs-tree-diff" % "2.0.1-63a917",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-b63e37",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-744d30")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
