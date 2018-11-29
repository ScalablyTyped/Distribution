organization := "com.scalablytyped"
name := "change-case"
version := "3.0.2-81ae5f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "camel-case" % "3.0.0-24ec40",
  "com.scalablytyped" %%% "constant-case" % "2.0.0-699b47",
  "com.scalablytyped" %%% "dot-case" % "2.1.1-a68759",
  "com.scalablytyped" %%% "header-case" % "1.0.1-26d1d8",
  "com.scalablytyped" %%% "is-lower-case" % "1.1.3-966d03",
  "com.scalablytyped" %%% "is-upper-case" % "1.1.2-1db5ed",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-2cc349",
  "com.scalablytyped" %%% "lower-case-first" % "1.0.2-1a60ad",
  "com.scalablytyped" %%% "no-case" % "2.3.2-08c5aa",
  "com.scalablytyped" %%% "param-case" % "2.1.1-41a98c",
  "com.scalablytyped" %%% "pascal-case" % "2.0.1-ccc10b",
  "com.scalablytyped" %%% "path-case" % "2.1.1-80412a",
  "com.scalablytyped" %%% "sentence-case" % "2.1.1-93244f",
  "com.scalablytyped" %%% "snake-case" % "2.1.0-bedfb7",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "swap-case" % "1.1.2-ad555a",
  "com.scalablytyped" %%% "title-case" % "2.1.1-636548",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-317ed2",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-1da625",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        