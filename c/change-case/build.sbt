organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-ab8978"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-c44f92",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-70fdb3",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-b08487",
  "org.scalablytyped" %%% "header-case" % "1.0.1-d4c025",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-3db0f9",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-f70141",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-c8aeef",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-33adab",
  "org.scalablytyped" %%% "no-case" % "2.3.2-5f1a48",
  "org.scalablytyped" %%% "param-case" % "2.1.1-d15fb4",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-b55f15",
  "org.scalablytyped" %%% "path-case" % "2.1.1-1393f7",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-9227e2",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-89b719",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-763cd0",
  "org.scalablytyped" %%% "title-case" % "2.1.1-454790",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b0d595",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-274a6d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        