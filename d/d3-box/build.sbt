organization := "com.scalablytyped"
name := "d3-box"
version := "0.0-unknown-dt-20181102Z-8da7b9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3" % "5.0-dt-20181102Z-8b0ff7",
  "com.scalablytyped" %%% "d3-array" % "1.2-dt-20181102Z-f71362",
  "com.scalablytyped" %%% "d3-axis" % "1.0-dt-20181102Z-cf5cc7",
  "com.scalablytyped" %%% "d3-brush" % "1.0-dt-20181116Z-e037a2",
  "com.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-51928a",
  "com.scalablytyped" %%% "d3-collection" % "1.0-dt-20181102Z-b17294",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20181102Z-8e0f46",
  "com.scalablytyped" %%% "d3-contour" % "1.3-dt-20181109Z-deec2c",
  "com.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20181102Z-fef271",
  "com.scalablytyped" %%% "d3-drag" % "1.2-dt-20181116Z-405040",
  "com.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-05f55d",
  "com.scalablytyped" %%% "d3-ease" % "1.0-dt-20181102Z-97a5a0",
  "com.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-ef68fa",
  "com.scalablytyped" %%% "d3-force" % "1.1-dt-20181102Z-604e49",
  "com.scalablytyped" %%% "d3-format" % "1.3-dt-20181102Z-a336e6",
  "com.scalablytyped" %%% "d3-geo" % "1.10-dt-20181102Z-4a9891",
  "com.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181102Z-9f27a6",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20181102Z-7cad2b",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20181102Z-4d199e",
  "com.scalablytyped" %%% "d3-polygon" % "1.0-dt-20181102Z-ca9f45",
  "com.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20181102Z-6cbd55",
  "com.scalablytyped" %%% "d3-random" % "1.1-dt-20181102Z-bacadc",
  "com.scalablytyped" %%% "d3-scale" % "2.0-dt-20181102Z-1bd164",
  "com.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20181102Z-cf2a8b",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181116Z-65931c",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-dbee18",
  "com.scalablytyped" %%% "d3-time" % "1.0-dt-20181102Z-cc98f0",
  "com.scalablytyped" %%% "d3-time-format" % "2.1-dt-20181102Z-c52dee",
  "com.scalablytyped" %%% "d3-timer" % "1.0-dt-20181102Z-aa7ed1",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-c0a559",
  "com.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20181102Z-77332d",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181116Z-a79944",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20181102Z-d820c3",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        