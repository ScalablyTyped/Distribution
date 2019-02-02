organization := "org.scalablytyped"
name := "d3-box"
version := "0.0-unknown-dt-20180214Z-6aee41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190103Z-6220f4",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190131Z-da68ce",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-001ff6",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-76b08c",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-ab160a",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-a44cef",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-54e6ef",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-c40299",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-430dd5",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-225ed1",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-d15340",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-c9d3ef",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-519a7f",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-50f1b4",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-f86a4f",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190103Z-cb7cae",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-30e38e",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-f561a2",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-e952c4",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-ccbc65",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-63356f",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-1be656",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-b733c5",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-21b72f",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-37a164",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190131Z-addd81",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-94d0f8",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-48e9e0",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-7cb093",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-64e584",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-493f0e",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-52c796",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-39aba4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        