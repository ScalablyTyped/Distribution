organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.3-b2c0d4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-c7bf63",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-c31646",
  "org.scalablytyped" %%% "fs-merger" % "3.1.0-2b51f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e93439",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "walk-sync" % "2.2.0-da4737")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
