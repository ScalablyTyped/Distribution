organization := "org.scalablytyped"
name := "cypress-recurse"
version := "1.23.0-62631e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "cypress" % "11.1.0-1b326c",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-508421",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ad21fc",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-4e4849",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
