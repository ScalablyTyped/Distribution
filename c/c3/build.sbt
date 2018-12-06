organization := "org.scalablytyped"
name := "c3"
version := "0.6-dt-20180910Z-b0a8c8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.0-dt-20181018Z-6de2f7",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-75c93e",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-342ec1",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181206Z-98ee3f",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-6db702",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-0443c1",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-63ebbb",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-f451de",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-68d546",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-b8b068",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-c6ab07",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-07de60",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-def8ce",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-585e3c",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-7c2492",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-a7bab4",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20180910Z-1297ff",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-11b81b",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-e0fe5b",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-ba005c",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-fc3184",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-a5c57a",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-20f1b0",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-cfd129",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-aaebc1",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-7b0179",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-45d29a",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-5a477b",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-f38a23",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-c54eec",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-c07d53",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181206Z-8f507d",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-3f2d21",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        