organization := "org.scalablytyped"
name := "datastore-core"
version := "8.0.2-678596"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "err-code" % "3.0.1-8b9154",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-25c05a",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-0a0540",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-0850c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
