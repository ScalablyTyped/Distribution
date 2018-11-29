organization := "com.scalablytyped"
name := "d3"
version := "5.0-dt-20181018Z-63d387"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-e09a78",
  "com.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-f7173f",
  "com.scalablytyped" %%% "d3-brush" % "1.0-dt-20181116Z-494269",
  "com.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-60e9ba",
  "com.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-7e48d6",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-4cd0f3",
  "com.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-733dfa",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-e70716",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181116Z-bf135c",
  "com.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-f23e99",
  "com.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-b317c6",
  "com.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-6e38b7",
  "com.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-343b51",
  "com.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-8e567c",
  "com.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-33b164",
  "com.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20180910Z-64e21b",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-a45541",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-a4e217",
  "com.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-a8be83",
  "com.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-bda269",
  "com.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-4dc5d4",
  "com.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-909ef0",
  "com.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-b77e42",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181120Z-ca857a",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-b7d83a",
  "com.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-242d7c",
  "com.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-bd3304",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-07e012",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-7912ea",
  "com.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-b468d6",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181120Z-a9d124",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-76d217",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        