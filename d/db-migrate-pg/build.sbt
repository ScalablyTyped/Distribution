organization := "com.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20180910Z-4c3ae7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20180910Z-c518d0",
  "com.scalablytyped" %%% "moment" % "2.22.2-b3769a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-8e7d70",
  "com.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-b375a5",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        