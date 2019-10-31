organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190819Z-51aa44"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-8b2b6a",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-fae46a",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-820246",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-48b607",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-fa5a29",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-45a26e",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-227d0b",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-5bec99",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-91e4e5",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-b650a8",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-0af37c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-f8f17f",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-03e320",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-7022c7",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-bbb22c",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-90322f",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-f9864a",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-88af92",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-c9c1d8",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6237a2",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-184aed",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-00ad12",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-67f000",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-7eb029",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-a75830",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-6d4930",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-699389",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-714d92",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        