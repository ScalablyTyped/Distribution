organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.7-5f1675"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-e6dafa",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-11263c",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-058c34",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-2e2c1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
