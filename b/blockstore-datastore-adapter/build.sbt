organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "4.0.0-0c7341"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-1e417e",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-b04ef9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-ade001",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-78f516",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-cf12ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
