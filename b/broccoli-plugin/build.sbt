organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.7-ab8f7f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-8bea54",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-f9df33",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-c73163",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-edaf9f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
