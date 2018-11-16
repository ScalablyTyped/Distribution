organization := "com.scalablytyped"
name := "change-case"
version := "3.0.2-1c014f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "camel-case" % "3.0.0-a2fdbe",
  "com.scalablytyped" %%% "constant-case" % "2.0.0-44bd54",
  "com.scalablytyped" %%% "dot-case" % "2.1.1-a048fc",
  "com.scalablytyped" %%% "header-case" % "1.0.1-5f366a",
  "com.scalablytyped" %%% "is-lower-case" % "1.1.3-5cdda5",
  "com.scalablytyped" %%% "is-upper-case" % "1.1.2-102d38",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-7a65c7",
  "com.scalablytyped" %%% "lower-case-first" % "1.0.2-17a2db",
  "com.scalablytyped" %%% "no-case" % "2.3.2-aaaa3f",
  "com.scalablytyped" %%% "param-case" % "2.1.1-d2ad2a",
  "com.scalablytyped" %%% "pascal-case" % "2.0.1-60ea5b",
  "com.scalablytyped" %%% "path-case" % "2.1.1-261d03",
  "com.scalablytyped" %%% "sentence-case" % "2.1.1-bde442",
  "com.scalablytyped" %%% "snake-case" % "2.1.0-4329f7",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "swap-case" % "1.1.2-022a0f",
  "com.scalablytyped" %%% "title-case" % "2.1.1-28a987",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-7482b2",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-6f6a0d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        