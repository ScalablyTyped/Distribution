organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20181121Z-968014"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20181121Z-e5cfb1",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-3a7a0a",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-bb8050",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        