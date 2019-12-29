organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190819Z-c11802"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-b5286d",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-033717",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-a7a220",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-2e4bc5",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-f8156d",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-67ff91",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-4d07dd",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d41aa3",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-32e698",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-fe0ae1",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-6c5a8a",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-0d950e",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-d47be6",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-3bcb9b",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-11e36d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-6d1a59",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-315940",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-854f51",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f0ec27",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-fcc331",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f5a2c1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-5a4578",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-87f0f2",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-f43166",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-b4618c",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-f6a6af",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-84d873",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-7872d0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-9d9bfd",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        