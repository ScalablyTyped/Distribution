organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "3.0.1-bcc564"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-427189",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.0-f63319",
  "org.scalablytyped" %%% "interface-store" % "3.0.0-501164",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-3a5b28",
  "org.scalablytyped" %%% "multiformats" % "9.9.0-ff23d3",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
