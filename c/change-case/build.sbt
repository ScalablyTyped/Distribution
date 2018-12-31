organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-d5525f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-f1c91f",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-2a4984",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-1aca44",
  "org.scalablytyped" %%% "header-case" % "1.0.1-fe88b4",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-8c4b81",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-3af636",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-1519b7",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-b77571",
  "org.scalablytyped" %%% "no-case" % "2.3.2-f67efd",
  "org.scalablytyped" %%% "param-case" % "2.1.1-d1f787",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-a90d28",
  "org.scalablytyped" %%% "path-case" % "2.1.1-ea4bde",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-4fa17d",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-89fc6c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-0a15d1",
  "org.scalablytyped" %%% "title-case" % "2.1.1-2d174a",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-381a7a",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-edba2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        