organization := "org.scalablytyped"
name := "d3-tip"
version := "v3.5.5-dt-20180910Z-9a8d3f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.0-dt-20181018Z-2f5a4d",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-113542",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-6e41cd",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181206Z-f29aa2",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-f8fd99",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-bcd06f",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-554fb4",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-f09467",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-125972",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-8a3e5d",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-e12268",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-85d2b6",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-82b951",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-1ca68e",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-4525ce",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-7ed671",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20180910Z-99b71f",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-085e72",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-b12217",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-9f80b1",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-44076d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-9231c6",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-366bd0",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-a5b67a",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-94ec66",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-52e30a",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-ae52bd",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-7de2f8",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-cb4085",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-1e763a",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-0e5761",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181206Z-70d56c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-881ff5",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        