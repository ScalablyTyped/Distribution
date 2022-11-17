organization := "org.scalablytyped"
name := "d3"
version := "7.4-dt-20221103Z-2e1cbe"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-3f90a9",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-765f1a",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-8a7fef",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-c7c917",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-019836",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-88b95b",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-f821e5",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-dc755d",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-875747",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-00ac87",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-91cb14",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-0b7b5b",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-ff421c",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-95f6f8",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-6e088b",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-a9a757",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-5df0c9",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1ae5b5",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-7f1830",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-f3bdb1",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-3ab382",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-6af12c",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-7a209a",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-4ef5bf",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-87c6dc",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-417973",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-96daa9",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-d59bf2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-a8b923",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
