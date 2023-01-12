organization := "org.scalablytyped"
name := "backgrid"
version := "0.2-dt-20220913Z-4e4389"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-e4aff1",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-33f6f2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-62291b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-19c570")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
