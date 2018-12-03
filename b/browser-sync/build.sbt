organization := "com.scalablytyped"
name := "browser-sync"
version := "0.0-unknown-dt-20180927Z-11c830"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-186a8c",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-d67b41",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-5d5875",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-50c51c",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-9a9ab6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        