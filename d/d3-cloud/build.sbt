organization := "org.scalablytyped"
name := "d3-cloud"
version := "v1.2.2-dt-20181231Z-85d8e2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-41c186",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-b3e035",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-bc580d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-dd49f3",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-2579c3",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-777976",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-ead2e9",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-ce5abf",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-13e131",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-d382e9",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-2ac664",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-6ee4e0",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-a4bbf3",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-b1b651",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-2ef79d",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-1788a8",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-91800e",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-4efb58",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-425ef0",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-b836e1",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-7255d8",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-16fa1e",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-d2ab66",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-368920",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c96b44",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-9c770a",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-87ce9c",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-468a7c",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-cdbbbd",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-24e6c7",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-ab5690",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-9b4c7a",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-75ec48",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        