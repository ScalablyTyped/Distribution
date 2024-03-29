organization := "org.scalablytyped"
name := "catbox-redis"
version := "4.1-dt-20201028Z-4f4a80"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-34ada1",
  "org.scalablytyped" %%% "ioredis" % "4.17-dt-20201115Z-2c7aa6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
