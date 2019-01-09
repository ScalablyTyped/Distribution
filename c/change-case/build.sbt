organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-c44ae5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-72337a",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-465768",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-4f0081",
  "org.scalablytyped" %%% "header-case" % "1.0.1-a53274",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-8b991b",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-58d00a",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-b63021",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-2ed6c0",
  "org.scalablytyped" %%% "no-case" % "2.3.2-188952",
  "org.scalablytyped" %%% "param-case" % "2.1.1-5adca8",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-a12a8c",
  "org.scalablytyped" %%% "path-case" % "2.1.1-c99bbb",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-d8cd82",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-b7072d",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-3898e0",
  "org.scalablytyped" %%% "title-case" % "2.1.1-98766c",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-a72ccd",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-cc80d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        