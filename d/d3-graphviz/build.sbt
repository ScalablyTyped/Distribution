organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20211202Z-c6e878"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-5b6e2d",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-1d2783",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-f7caf7",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-32c925",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-1a628f",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
