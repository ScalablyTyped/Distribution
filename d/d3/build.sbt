organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20200225Z-2f1bf3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200225Z-f441a9",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200225Z-9c3683",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200302Z-d3c952",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200225Z-038e2f",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200225Z-d29c36",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200225Z-ea946c",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200225Z-d254ef",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200225Z-cbd695",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200225Z-1d478e",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200225Z-34e806",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-fb6601",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200225Z-840dd7",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200225Z-68ef08",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-239a4c",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200225Z-2eed86",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200225Z-edb7b1",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200225Z-70e5fa",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200225Z-7c08a5",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-a77e29",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200305Z-d830ae",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-35059d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200225Z-a31c9d",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-47ca5e",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-75397f",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-126f08",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200225Z-afd0c0",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200225Z-572ced",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200225Z-bf1aec",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-67022f",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
