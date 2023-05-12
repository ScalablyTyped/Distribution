organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.6-dt-20211202Z-f9c5ed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7acbb7",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20221230Z-c1624f",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20220824Z-733e94",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20230322Z-ed373b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
