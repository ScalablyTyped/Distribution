organization := "org.scalablytyped"
name := "browser-sync"
version := "0.0-unknown-dt-20180927Z-d2a94e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-08429b",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-ac28f3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-b93914",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-df9d30",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-e9c641",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-de6390",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        