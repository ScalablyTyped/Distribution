organization := "org.scalablytyped"
name := "cp-file"
version := "6.1.0-4acae1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-856ebf",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-b62219",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-67b4ea",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-89c2de",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        