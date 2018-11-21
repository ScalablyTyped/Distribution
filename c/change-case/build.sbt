organization := "com.scalablytyped"
name := "change-case"
version := "3.0.2-7a48e0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "camel-case" % "3.0.0-a987b4",
  "com.scalablytyped" %%% "constant-case" % "2.0.0-5f1809",
  "com.scalablytyped" %%% "dot-case" % "2.1.1-b1ea85",
  "com.scalablytyped" %%% "header-case" % "1.0.1-66b93d",
  "com.scalablytyped" %%% "is-lower-case" % "1.1.3-af0ab8",
  "com.scalablytyped" %%% "is-upper-case" % "1.1.2-519e2c",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-c49888",
  "com.scalablytyped" %%% "lower-case-first" % "1.0.2-a23781",
  "com.scalablytyped" %%% "no-case" % "2.3.2-99e2c6",
  "com.scalablytyped" %%% "param-case" % "2.1.1-f40517",
  "com.scalablytyped" %%% "pascal-case" % "2.0.1-9f25c8",
  "com.scalablytyped" %%% "path-case" % "2.1.1-ed88be",
  "com.scalablytyped" %%% "sentence-case" % "2.1.1-0afbab",
  "com.scalablytyped" %%% "snake-case" % "2.1.0-03e973",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "swap-case" % "1.1.2-1e59f6",
  "com.scalablytyped" %%% "title-case" % "2.1.1-ad035e",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-49bf36",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-8f8e40",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        