organization := "org.scalablytyped"
name := "backbone_dot_marionette"
version := "3.3-dt-20211202Z-08ca57"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-7c8df1",
  "org.scalablytyped" %%% "backbone_dot_radio" % "0.8-dt-20221103Z-19a6bb",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-9a2a4d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-4e4849",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-2510dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
