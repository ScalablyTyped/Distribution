organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20181121Z-a0caa2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20181121Z-83cded",
  "org.scalablytyped" %%% "moment" % "2.23.0-f391bb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-2a9220",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-0f8d67",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        