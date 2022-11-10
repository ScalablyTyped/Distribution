organization := "org.scalablytyped"
name := "datastore-fs"
version := "8.0.0-6468e1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datastore-core" % "8.0.2-6aa4f2",
  "org.scalablytyped" %%% "err-code" % "3.0.1-74fabc",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-b04ef9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-ade001",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-cf12ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
