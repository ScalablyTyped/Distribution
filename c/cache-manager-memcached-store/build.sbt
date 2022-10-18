organization := "org.scalablytyped"
name := "cache-manager-memcached-store"
version := "3.0-dt-20220225Z-ac78e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cache-manager" % "5.0.1-fbb6a8",
  "org.scalablytyped" %%% "lru-cache" % "7.14.0-0e6613",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
