organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20220818Z-2b4970"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20220818Z-6b30ef",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-9b0540",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-2e277f",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-976602",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
