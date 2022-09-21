organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20211202Z-51b638"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-72e26c",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-289c33",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-acb353",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-4e2220",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-ae5189",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
