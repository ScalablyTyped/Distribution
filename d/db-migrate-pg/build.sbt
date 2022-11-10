organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20220818Z-5a2191"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-6d7ec9",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20220818Z-55e768",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-3b9a6d",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-84a761",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-3f47aa",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
