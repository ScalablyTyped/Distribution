organization := "org.scalablytyped"
name := "d3-sankey"
version := "0.11-dt-20211202Z-3b186e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
