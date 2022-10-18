organization := "org.scalablytyped"
name := "d3"
version := "7.4-dt-20220913Z-519e56"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-3a190d",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-43faa1",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-519c95",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-829387",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-5b6e2d",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-b54f51",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-f8c711",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-03d3f0",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-224d6b",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-dce145",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-b88c1a",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-209cb8",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-120300",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-af2d77",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-448316",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-abab50",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-1d2783",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-db2a31",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-36dbc9",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-87be1b",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-f7caf7",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3d3755",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-33e699",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-3b4c47",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-32c925",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-1a628f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-feb617",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
