organization := "org.scalablytyped"
name := "conf"
version := "3.0.0-be4161"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "dot-prop" % "4.2-dt-20181121Z-4ff384",
  "org.scalablytyped" %%% "env-paths" % "2.1.0-41a8c8",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-b62219",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-89c2de",
  "org.scalablytyped" %%% "pkg-up" % "2.0-dt-20181117Z-c01d64",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-6580b3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        