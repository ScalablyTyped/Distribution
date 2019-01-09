organization := "org.scalablytyped"
name := "d3-tip"
version := "v3.5.5-dt-20180214Z-23b652"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.5-dt-20181216Z-4f9302",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-6e15c4",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-2a46dd",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-5776e2",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-02eb2b",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-522425",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-b66813",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-140353",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-e2167e",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-eaf1c3",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-569996",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-b84d27",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-d93d51",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-a47588",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-821959",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180514Z-bbd8c2",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-e110ae",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-375c56",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-237915",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-b8b902",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-96487b",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-029539",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-3abf5d",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-7ef83f",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-059180",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-4d78f5",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-efa461",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-166981",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-e3a89e",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-92dc0c",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-89da5c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-27e237",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-5d845b",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        