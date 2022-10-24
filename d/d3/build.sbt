organization := "org.scalablytyped"
name := "d3"
version := "7.4-dt-20220913Z-200207"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-39c0e7",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-64dcdf",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-c01e38",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-01ba65",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9208ca",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-3de6c4",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-2392bb",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-dc4aaf",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-285790",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-d34747",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-5975ea",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-301486",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-98a364",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-5065b2",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-36d0aa",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-3d4e4e",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-32d263",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-a0560c",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-de8bf6",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-729417",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-606835",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-7d17be",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-be7ce5",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-2fa732",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-8ced9f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
