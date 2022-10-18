organization := "org.scalablytyped"
name := "backbone_dot_layoutmanager"
version := "0.9-dt-20211202Z-0596ba"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-82de60",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-d77df1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
