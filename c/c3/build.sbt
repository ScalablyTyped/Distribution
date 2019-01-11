organization := "org.scalablytyped"
name := "c3"
version := "0.6-dt-20180829Z-e0c03b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.5-dt-20181216Z-72ee1a",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-f253aa",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-67294a",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-aaa374",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-0cff1a",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-db42ea",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-69950c",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-8cd784",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-a99191",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-3ac618",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-3e363e",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-43ba0f",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-a49d17",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-4225a6",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-a1fee8",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180514Z-8e6e83",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-acdb79",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-3ac916",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-2dd015",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-16bddb",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-aed86d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-72b792",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-9957d3",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-744703",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-d2359f",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-21834e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-6f62fe",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-cc514c",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-49512d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-3f5e72",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-1c38a5",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-9016f7",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-c15177",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        