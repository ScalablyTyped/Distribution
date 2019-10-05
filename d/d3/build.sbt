organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190819Z-7786e8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-5c5ea8",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-d9d14d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-b1ebf2",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-aa9e9f",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-1c5fa7",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-4bd662",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-6fe49e",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-8ad9aa",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-aa5687",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-e5823f",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-0af37c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-17092a",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-54e916",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-765e77",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-f05144",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-69dc3a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-7201a1",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-88af92",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-cfb9fc",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-ea2f50",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a11350",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a9a8f",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-9ee241",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-7eb029",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-04b38b",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-51905c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-6db0fb",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-cccebd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        