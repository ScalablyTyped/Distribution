organization := "org.scalablytyped"
name := "dc"
version := "4.2-dt-20221230Z-4f4c28"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20230328Z-2a7905",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-420d23",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20221230Z-68e43c",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7acbb7",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20221230Z-fce24b",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20221230Z-c1624f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
