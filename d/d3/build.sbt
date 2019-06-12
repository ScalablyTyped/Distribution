organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190212Z-679434"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-3c0eed",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-e6a256",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-97f503",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-06857a",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-3beda8",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-04842e",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-c16196",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-e4eb68",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-acd207",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-81406f",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-56cdfd",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-1849af",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-bbccae",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-c34c89",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-46dfa3",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-f45ffd",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-47f99d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-dc6420",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-deac52",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-a5fa27",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-03d2f0",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-88a721",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-baebee",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-3085c7",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-b9e7fd",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-561dce",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-cbcd39",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-762b1c",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        