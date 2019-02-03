organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-48baf7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-1956b5",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-12371d",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-0bde43",
  "org.scalablytyped" %%% "header-case" % "1.0.1-8455c6",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-bf8653",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-eee7c1",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-f8ef62",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-624f15",
  "org.scalablytyped" %%% "no-case" % "2.3.2-5e99e2",
  "org.scalablytyped" %%% "param-case" % "2.1.1-03cd7e",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-779d14",
  "org.scalablytyped" %%% "path-case" % "2.1.1-195f52",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-9fbbc5",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-4842b2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-ce730f",
  "org.scalablytyped" %%% "title-case" % "2.1.1-f56a1d",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b40f84",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-c15fe5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        