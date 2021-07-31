organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20201005Z-16b26e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-64d81e",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-d5db1f",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-68e4fa",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-a74a74",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-e733a2",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
