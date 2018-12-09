organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20181121Z-8361cd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20181121Z-52548a",
  "org.scalablytyped" %%% "moment" % "2.22.2-d1dfb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-e6c0eb",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-fd3926",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        