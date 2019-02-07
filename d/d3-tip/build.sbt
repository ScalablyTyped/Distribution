organization := "org.scalablytyped"
name := "d3-tip"
version := "v3.5.5-dt-20180214Z-24835b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190103Z-48041d",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190131Z-0fb92b",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-aa6db9",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-ec23d7",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-aefb62",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-8b6792",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-a46f6d",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-c02979",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-cb76cb",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-e9314b",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-fcf0a2",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-54d6e4",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-1356af",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190131Z-3228b7",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-70c38c",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190103Z-589595",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-5b6447",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-522108",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-592800",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-ac0eba",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-c08181",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-609dce",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-8cfa36",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-9087bc",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-2d0be2",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190131Z-f6ea03",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-7b4468",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-1854d4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-09fe77",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-99e932",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-e659db",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-f307a0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-038c51",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        