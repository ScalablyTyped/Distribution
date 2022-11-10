organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.6-dt-20211202Z-860c2b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-e38452",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-576765",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20220824Z-9b705a",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20221103Z-c06119",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
