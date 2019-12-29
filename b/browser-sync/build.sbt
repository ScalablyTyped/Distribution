organization := "org.scalablytyped"
name := "browser-sync"
version := "2.26-dt-20190819Z-2ed5e0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-d75dce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        