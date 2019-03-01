organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-cdcdfa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-869e07",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-f8ff62",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-7dd04c",
  "org.scalablytyped" %%% "header-case" % "1.0.1-075cb6",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-a57ead",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-f250d1",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-2618f9",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-d070ec",
  "org.scalablytyped" %%% "no-case" % "2.3.2-997ef0",
  "org.scalablytyped" %%% "param-case" % "2.1.1-c980cd",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-e37faa",
  "org.scalablytyped" %%% "path-case" % "2.1.1-3403b4",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-acb17b",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-8e836b",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-3bb1cd",
  "org.scalablytyped" %%% "title-case" % "2.1.1-aa6715",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-fb7c79",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-ab5cc7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        