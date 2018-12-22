organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-c0896f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-794df0",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-c9af69",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-c5e5e4",
  "org.scalablytyped" %%% "header-case" % "1.0.1-0db04a",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-13ece5",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-9ac264",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e49760",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-9a90b0",
  "org.scalablytyped" %%% "no-case" % "2.3.2-a9e058",
  "org.scalablytyped" %%% "param-case" % "2.1.1-d2ac3f",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-4cbe51",
  "org.scalablytyped" %%% "path-case" % "2.1.1-c6d8eb",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-9ddb11",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-65954d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-6d212f",
  "org.scalablytyped" %%% "title-case" % "2.1.1-aca730",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-cb4b52",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-f4729d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        