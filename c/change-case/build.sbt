organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-cb27d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-ef2f8a",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-0be9b9",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-1405d3",
  "org.scalablytyped" %%% "header-case" % "1.0.1-f173b0",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-3efb12",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-09985a",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e04dbe",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-f2f54d",
  "org.scalablytyped" %%% "no-case" % "2.3.2-0f7868",
  "org.scalablytyped" %%% "param-case" % "2.1.1-f23958",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-f47187",
  "org.scalablytyped" %%% "path-case" % "2.1.1-6efdcb",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-643633",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-a1100b",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-7864a7",
  "org.scalablytyped" %%% "title-case" % "2.1.1-435820",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-7522dc",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-cef882")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        