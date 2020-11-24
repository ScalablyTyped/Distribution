organization := "org.scalablytyped"
name := "d3"
version := "6.2-dt-20201118Z-d48076"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.8-dt-20201116Z-6a1bbf",
  "org.scalablytyped" %%% "d3-axis" % "2.0-dt-20201104Z-015c09",
  "org.scalablytyped" %%% "d3-brush" % "2.1-dt-20200930Z-455162",
  "org.scalablytyped" %%% "d3-chord" % "2.0-dt-20200929Z-9eb878",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-fef72f",
  "org.scalablytyped" %%% "d3-contour" % "2.0-dt-20200930Z-3c9c83",
  "org.scalablytyped" %%% "d3-delaunay" % "5.3-dt-20200930Z-91114f",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-58e313",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-66cedb",
  "org.scalablytyped" %%% "d3-dsv" % "2.0-dt-20201001Z-13587e",
  "org.scalablytyped" %%% "d3-ease" % "2.0-dt-20200930Z-913ff3",
  "org.scalablytyped" %%% "d3-fetch" % "2.0-dt-20201001Z-b8e309",
  "org.scalablytyped" %%% "d3-force" % "2.1-dt-20201002Z-e5305c",
  "org.scalablytyped" %%% "d3-format" % "2.0-dt-20200930Z-440b3e",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-2d1d67",
  "org.scalablytyped" %%% "d3-hierarchy" % "2.0-dt-20200929Z-81a7a0",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-fcac2d",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-2014df",
  "org.scalablytyped" %%% "d3-quadtree" % "2.0-dt-20200930Z-5f1079",
  "org.scalablytyped" %%% "d3-random" % "2.2-dt-20201002Z-d058e1",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-490c7d",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-789400",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-922d2f",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-415e8e",
  "org.scalablytyped" %%% "d3-time-format" % "3.0-dt-20201002Z-c2078f",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-64bf88",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-631a25",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-4d242e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-bda5da",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
