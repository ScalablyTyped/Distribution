organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-6d0d74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-ffcf50",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-56820c",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-15e953",
  "org.scalablytyped" %%% "header-case" % "1.0.1-e640db",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-afc09f",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-06ed6b",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-9a10d6",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-36b7fd",
  "org.scalablytyped" %%% "no-case" % "2.3.2-243389",
  "org.scalablytyped" %%% "param-case" % "2.1.1-1f3e64",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-d77251",
  "org.scalablytyped" %%% "path-case" % "2.1.1-466cd1",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-2a6806",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-d0a82d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-3009e4",
  "org.scalablytyped" %%% "title-case" % "2.1.1-61b20c",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-fe64d6",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-f19a0a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        