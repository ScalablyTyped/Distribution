organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-6093c3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-4f2295",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-e801e8",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-100be7",
  "org.scalablytyped" %%% "header-case" % "1.0.1-3415c1",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-3bf64c",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-5514e7",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-409600",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-03f0a4",
  "org.scalablytyped" %%% "no-case" % "2.3.2-427e23",
  "org.scalablytyped" %%% "param-case" % "2.1.1-f789ed",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-4547f2",
  "org.scalablytyped" %%% "path-case" % "2.1.1-165518",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-9cc117",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-aefc75",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-3d97cc",
  "org.scalablytyped" %%% "title-case" % "2.1.1-2cd79e",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-8e28f8",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-7878fd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        