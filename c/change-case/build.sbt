organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-dc5cd6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-aad1c4",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-dab804",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-b73349",
  "org.scalablytyped" %%% "header-case" % "1.0.1-1e83ac",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-9ee112",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-0e4d5f",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-7dfd7c",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-d78608",
  "org.scalablytyped" %%% "no-case" % "2.3.2-35ee62",
  "org.scalablytyped" %%% "param-case" % "2.1.1-16d27b",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-c22113",
  "org.scalablytyped" %%% "path-case" % "2.1.1-966488",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-4a415a",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-b623f8",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-3b3d36",
  "org.scalablytyped" %%% "title-case" % "2.1.1-d924ad",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-614681",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-6367d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        