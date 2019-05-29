organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190212Z-ac2f2c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-0b1228",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-e9c176",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-ef97d9",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-fcabb8",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-9af696",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-4bd29a",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-c4617f",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cd2847",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-138259",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-140944",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-56cdfd",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-89e193",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-3685fc",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-37ad26",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-0e6a7d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-1033c6",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-0e2015",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-dc6420",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-e83904",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-02a8fd",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-19af2e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c9ddc4",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-5a6fb9",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-3085c7",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-3d3fd8",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-5b9e9c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-5aa049",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-9c6dd8",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        