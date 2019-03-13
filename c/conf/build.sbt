organization := "org.scalablytyped"
name := "conf"
version := "3.0.0-5c4a6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "dot-prop" % "4.2-dt-20181121Z-5c57ed",
  "org.scalablytyped" %%% "env-paths" % "2.1.0-de7a06",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-f0dff6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "pkg-up" % "2.0-dt-20181117Z-f5a803",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-e72c15")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        