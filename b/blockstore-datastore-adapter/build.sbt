organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "4.0.0-cba67e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-7405e5",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-126aa3",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-c00699",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-d89a36",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-9a5439")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
