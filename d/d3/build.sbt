organization := "org.scalablytyped"
name := "d3"
version := "7.4-dt-20221103Z-6d0bc4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-8e2d87",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-79bb02",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-9f3b5b",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-a065d9",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-e91a54",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-35af31",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-84d042",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-877a34",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-8040a3",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-58b2de",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-7503df",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-9ca47b",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-0a18f7",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-c1c3c1",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-c35029",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-2ae819",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-314ac9",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-17dfe8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-4f7309",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-59855a",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-0efd25",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-a50cc0",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-394a10",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-65b7df",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-cc2f2a",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c21ab7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
