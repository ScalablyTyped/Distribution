organization := "org.scalablytyped"
name := "cache-manager-ioredis"
version := "2.0-dt-20211202Z-7e8b43"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cache-manager" % "v4.0.1-dt-20220902Z-6e444e",
  "org.scalablytyped" %%% "denque" % "2.1.0-42158f",
  "org.scalablytyped" %%% "ioredis" % "5.2.3-f4e13a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "redis-errors" % "1.2-dt-20211202Z-6fd284",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
