organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.6-dt-20211202Z-4ae2c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-07c147",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-a142cc",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20220824Z-464050",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20221103Z-6a748b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
