organization := "org.scalablytyped"
name := "cache-manager-ioredis"
version := "2.0-dt-20221026Z-58bfbf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cache-manager" % "5.1.3-9fa928",
  "org.scalablytyped" %%% "denque" % "2.1.0-910a4e",
  "org.scalablytyped" %%% "ioredis" % "5.2.4-10e00d",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-448518",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "redis-errors" % "1.2-dt-20211202Z-99a15d",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
