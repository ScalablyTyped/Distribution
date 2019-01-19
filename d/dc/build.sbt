organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20180829Z-88a802"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190103Z-319c48",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-b3a8ff",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-0e012d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-d1c248",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-a535c9",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-722d8c",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-12ef03",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-37222b",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-92a416",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-f3ed89",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-42996e",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-73a9ad",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-faf1db",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-0c3118",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-030520",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190103Z-f47bc9",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-78e12d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-539cf0",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-cd4c8c",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-1624f8",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-a7976d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-a852a1",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-c8c3e8",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-271cc3",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-b3631b",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20190110Z-3932fe",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-9f621b",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-3af637",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-68af48",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-3aa70b",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-cb31f8",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-7702d7",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-e6cf03",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        