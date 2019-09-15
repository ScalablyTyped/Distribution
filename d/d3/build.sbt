organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190819Z-184c2f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-760fd0",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-0632dc",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-6d6f0d",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-dd09d2",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-fd899e",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9e3e3f",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-b5ce89",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-c5e11c",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-61250a",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-f16b18",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-36846f",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-d3481f",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-d765c1",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-73f46c",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-3dfd48",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-28f1e7",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-5f0324",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f12cb3",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-b7da72",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f93212",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-896440",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-cd60ea",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-dd1d0d",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-8748cc",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-d60c5b",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-3ee740",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d63a8d",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-799032",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        