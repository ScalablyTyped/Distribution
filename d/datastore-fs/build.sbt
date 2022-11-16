organization := "org.scalablytyped"
name := "datastore-fs"
version := "8.0.0-2ab473"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datastore-core" % "8.0.2-ed4cc0",
  "org.scalablytyped" %%% "err-code" % "3.0.1-277b1a",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-126aa3",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-c00699",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-9a5439")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
