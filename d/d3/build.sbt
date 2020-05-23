organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20200515Z-00c053"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200515Z-1c38a5",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200515Z-a8d07c",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200515Z-e3f671",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200515Z-1f1dd4",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-3364b2",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-bf03a2",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200515Z-eddb02",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200515Z-135437",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-7fb01a",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200515Z-cb8e79",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20200515Z-f4b86b",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200515Z-679855",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200515Z-c6dd5e",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20200515Z-2ad9c1",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200515Z-2cafbd",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200515Z-d73478",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-4d1515",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-80eb11",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200515Z-1764db",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20200515Z-d1faa1",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-926a7d",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-63e92d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-788163",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-8b0cdd",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20200515Z-0635a8",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-e0fb9b",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-982503",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200515Z-0cc5e5",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200515Z-3269b2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-0ec701",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
