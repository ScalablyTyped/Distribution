organization := "org.scalablytyped"
name := "d3"
version := "7.4-dt-20221230Z-68700b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20230525Z-061fb1",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20230328Z-acaa2f",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20221230Z-9a7c9a",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20221230Z-935ae5",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9ae1d2",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20221230Z-f1df89",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-bdc70d",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20221230Z-282096",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20221230Z-74f6eb",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20221230Z-d8bac0",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20221230Z-f5c282",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20221230Z-14c4ef",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-4d7652",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20221230Z-245c31",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20230126Z-f18a48",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20221230Z-fb2f27",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20221230Z-036b5c",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-e7643d",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20230525Z-aa0fec",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7766af",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20221230Z-dd436f",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-107330",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-005e96",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20221230Z-6b3fff",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20230525Z-fee2cf",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
