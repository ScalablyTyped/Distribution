organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.6-dt-20201118Z-21f8c7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-199e0c",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20200507Z-f3b1d0",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20201002Z-607890",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
