organization := "org.scalablytyped"
name := "blockstore-core"
version := "2.0.1-b61d3a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "err-code" % "3.0.1-95f15f",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-9d171a",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-cc5814",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
