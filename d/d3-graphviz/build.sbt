organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20201005Z-484b3d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-2bf171",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-e0e9c1",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-199e0c",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-42bb2c",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-6abf03",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
