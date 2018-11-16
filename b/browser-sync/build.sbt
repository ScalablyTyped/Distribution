organization := "com.scalablytyped"
name := "browser-sync"
version := "0.0-unknown-dt-20181102Z-de8939"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "braces" % "2.3-dt-20181102Z-1ab20f",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20181102Z-1e4973",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20181102Z-8da2fa",
  "com.scalablytyped" %%% "micromatch" % "3.1-dt-20181102Z-895b36",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20181102Z-399813",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20181102Z-c1072c",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        