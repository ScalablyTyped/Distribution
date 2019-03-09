organization := "org.scalablytyped"
name := "conf"
version := "3.0.0-98e658"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "dot-prop" % "4.2-dt-20181121Z-00b318",
  "org.scalablytyped" %%% "env-paths" % "2.1.0-0557e3",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-b4287c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "pkg-up" % "2.0-dt-20181117Z-6c3a60",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-4175d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        