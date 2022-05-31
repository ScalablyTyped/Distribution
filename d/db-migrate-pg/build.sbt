organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20201002Z-971d06"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8f0838",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20201002Z-0f1d89",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20201117Z-b06184",
  "org.scalablytyped" %%% "pg-types" % "2.2.0-5ebf56",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
