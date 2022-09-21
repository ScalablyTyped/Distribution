organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "3.0.1-6465eb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-964e21",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.0-af5e3e",
  "org.scalablytyped" %%% "interface-store" % "3.0.0-47e5bc",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-ff86dd",
  "org.scalablytyped" %%% "multiformats" % "9.9.0-32eac2",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
