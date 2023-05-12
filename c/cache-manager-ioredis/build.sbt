organization := "org.scalablytyped"
name := "cache-manager-ioredis"
version := "2.0-dt-20221026Z-5cf840"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cache-manager" % "5.2.1-d33ccc",
  "org.scalablytyped" %%% "denque" % "2.1.0-beb622",
  "org.scalablytyped" %%% "ioredis" % "5.3.2-262f0b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "redis-errors" % "1.2-dt-20211202Z-764393",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
