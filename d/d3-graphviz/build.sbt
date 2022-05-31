organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20201005Z-c575d2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-92e398",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-aa67e8",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-a8cb53",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-efca7d",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-c4b70c",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
