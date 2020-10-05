organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20200515Z-bb2dd5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200515Z-c6cf70",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200515Z-e466f7",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200605Z-3f438c",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200515Z-0d394d",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-c78492",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-f0e16d",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200515Z-29348d",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200707Z-a00282",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-8ff857",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200515Z-559143",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20200515Z-a65d96",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200515Z-aba96f",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200515Z-77ec45",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20200515Z-1593d8",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200515Z-cc907d",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200515Z-968c80",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-996f31",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-a84c6d",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200515Z-8af91b",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20200515Z-eb4b31",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-503e44",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-959b5c",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-299ff3",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-d0edc7",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20200515Z-a69292",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-c954e4",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-949829",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200515Z-a14100",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200515Z-e8fb7c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-389d0c",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
