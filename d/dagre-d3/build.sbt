organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20180917Z-461827"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.0-dt-20181018Z-830dae",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-4b38bd",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-6046cb",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181206Z-e6eeda",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-4897e3",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-d46015",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-c4d7c3",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-a7d7a0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-32d274",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-e7f5c6",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-02ef72",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-3022db",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-d67949",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-b7ec58",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-736dc9",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-dfdcfa",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181214Z-561ecc",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-d0b670",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-c4d535",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-f53993",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-ba4333",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-ae1657",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-f11924",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-ed3ce5",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-872689",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181213Z-45ac4d",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-0254d1",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-5e2264",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-f050bd",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-a66333",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-e8ade3",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181213Z-1e3e8a",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-927af6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-413c9e",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        