organization := "org.scalablytyped"
name := "conf"
version := "3.0.0-7da9eb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "dot-prop" % "4.2-dt-20181121Z-280c0f",
  "org.scalablytyped" %%% "env-paths" % "2.1.0-f8f2ba",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-775f33",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "pkg-up" % "2.0-dt-20181117Z-3faa45",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-7a96cf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        