organization := "org.scalablytyped"
name := "browser-sync"
version := "0.0-unknown-dt-20180924Z-31c1e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d5ee42",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-536948",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-94c9f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        