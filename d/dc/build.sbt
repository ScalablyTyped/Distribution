organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20190322Z-f4f1de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-26f873",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-2ec3fb",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-31befc",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-21c056",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-ac4c93",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-37bbfa",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-962eea",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-18ab43",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-24be92",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-2b23c6",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-cb61ac",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-2265bf",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-c2e46c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-98ef5a",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-776e85",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-5c9cee",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-966675",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-afdb9d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-4f9a84",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-a39799",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-b7bd3f",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-909236",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-0106fa",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-7bb689",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-1b1f17",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-cd5971",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-130d19",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-79b295",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-159307",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-7dc0e3",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-9764bb",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-1d2ac8",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-8f5374",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        