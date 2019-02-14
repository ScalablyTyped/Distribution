organization := "org.scalablytyped"
name := "d3_dot_slider"
version := "0.0-unknown-dt-20180214Z-ad2d6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-ee8983",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190212Z-0fb92b",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-dfb39c",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-ae8bf2",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-aefb62",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-8b6792",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-a46f6d",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-f2988e",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cb76cb",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-4b46e6",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-fcf0a2",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-54d6e4",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-d2bf21",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-3228b7",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-70c38c",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-76f779",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-5b6447",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-eb966c",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-592800",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-ac0eba",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-c08181",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-609dce",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-039122",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-9087bc",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-6b2eec",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1017e2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-7b4468",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-1854d4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-09fe77",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6f430d",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-e659db",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-e5d502",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-038c51",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        