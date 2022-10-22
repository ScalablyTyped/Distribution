organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20220818Z-8e12f2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20220818Z-6b30ef",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-d0a34f",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-2d869c",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-0c9097",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
