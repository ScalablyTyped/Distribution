organization := "org.scalablytyped"
name := "cache-manager-redis-store"
version := "2.0-dt-20211209Z-b4b8ea"
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
