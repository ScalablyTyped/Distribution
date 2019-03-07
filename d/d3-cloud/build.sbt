organization := "org.scalablytyped"
name := "d3-cloud"
version := "v1.2.5-dt-20190305Z-63fbf0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-c89029",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-cbb8fa",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-293dbc",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-0177be",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-ed82f7",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-92ad35",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-c24282",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-48f534",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-f28fd7",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-e2c56b",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-524443",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-fa2ca4",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-7c5943",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-b5f1f7",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-0aff82",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-13b3c1",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-911cd4",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-1d5b01",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-0535a9",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-d51375",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-26b52d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-47b72f",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-d584e0",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-734dee",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c58eff",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-4da604",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-eb41b5",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-8e5053",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-4323a2",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-d74add",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-75cd54",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d0d7f0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-7a197a",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        