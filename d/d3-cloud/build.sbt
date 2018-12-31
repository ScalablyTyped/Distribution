organization := "org.scalablytyped"
name := "d3-cloud"
version := "v1.2.2-dt-20180910Z-83b72d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.5-dt-20181216Z-01a1a9",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-37e35e",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-90577f",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-adbdc8",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-07bde8",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-f04a3f",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-6cd3dd",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-60b01a",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-7b55e5",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-42f009",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181115Z-7da1f8",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-50622b",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181219Z-a23a83",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-195855",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-84fe17",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180514Z-b5e9f8",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-682cfa",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-68f70d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-f79823",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-8c451d",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-cf2033",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-0e6a45",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-9768f1",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-ba0938",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-204a2e",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-2cba1a",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-871047",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-0e9dbe",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-01d45d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-b55272",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-2693f9",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-0bcb2c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-43492e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        