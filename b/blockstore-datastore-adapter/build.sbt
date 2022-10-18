organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "3.0.1-b750e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-74fa13",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-da5dc9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-7ca61f",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-db3546",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-caebd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
