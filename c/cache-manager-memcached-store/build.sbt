organization := "org.scalablytyped"
name := "cache-manager-memcached-store"
version := "3.0-dt-20220225Z-cc5bbd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cache-manager" % "5.1.3-3d0c4c",
  "org.scalablytyped" %%% "lru-cache" % "7.14.1-5473ac",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
