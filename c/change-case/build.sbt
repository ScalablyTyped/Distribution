organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-3ec04e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-751e42",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-8b40b0",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-5c3e51",
  "org.scalablytyped" %%% "header-case" % "1.0.1-a7764b",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-ee9e57",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-76ee31",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-082dba",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-f49c85",
  "org.scalablytyped" %%% "no-case" % "2.3.2-a32b91",
  "org.scalablytyped" %%% "param-case" % "2.1.1-508521",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-deba29",
  "org.scalablytyped" %%% "path-case" % "2.1.1-3e3cb4",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-7b56da",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-fdf059",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-973531",
  "org.scalablytyped" %%% "title-case" % "2.1.1-c28b6d",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-d5cf31",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-54e498")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        