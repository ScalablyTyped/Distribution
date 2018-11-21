organization := "com.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20180917Z-cea938"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3" % "5.0-dt-20181018Z-26f129",
  "com.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-ff8909",
  "com.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-4160f6",
  "com.scalablytyped" %%% "d3-brush" % "1.0-dt-20181116Z-4f9d60",
  "com.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-91d834",
  "com.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-872cf5",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-0414a8",
  "com.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-73d8f4",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-558b23",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181116Z-04631a",
  "com.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-bd0ec4",
  "com.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-279eb6",
  "com.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-7d2907",
  "com.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-afb332",
  "com.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-403a5a",
  "com.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-0daf69",
  "com.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20180910Z-e36ea9",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-fe257d",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-793634",
  "com.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-8531c2",
  "com.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-6a7354",
  "com.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-aa5de4",
  "com.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-33f2f7",
  "com.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-1fd3ce",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181120Z-74ec8f",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-7deffe",
  "com.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-f4f01b",
  "com.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-224262",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-25a8ac",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-37f57d",
  "com.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-33e740",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181120Z-bc3297",
  "com.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-0b04f8",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-60feb0",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        