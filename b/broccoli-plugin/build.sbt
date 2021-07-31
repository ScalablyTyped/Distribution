organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.3-ab7809"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-5e3ff9",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-817da3",
  "org.scalablytyped" %%% "fs-merger" % "3.1.0-02c999",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-916fd1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "walk-sync" % "2.2.0-eed00c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
