organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20200225Z-cd6584"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200225Z-56316d",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200225Z-52cd7c",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200302Z-9bcf76",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200225Z-2ee2eb",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200225Z-358093",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200225Z-68713f",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200225Z-49b15e",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200225Z-f5c3e8",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200225Z-908fb6",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200225Z-f6a28e",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-fb6601",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200225Z-94c204",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200225Z-d97c6f",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-e15946",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200225Z-d88185",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200225Z-8c6f46",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200225Z-c31b4a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200225Z-7f712a",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-acb99d",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200305Z-fba760",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-a53e09",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200225Z-cb4d23",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-a1da9a",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-b4fcff",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-126f08",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200225Z-337cf0",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200225Z-5f1ff1",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200225Z-201160",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-bd3076",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
