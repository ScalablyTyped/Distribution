organization := "org.scalablytyped"
name := "conf"
version := "3.0.0-2b590a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "dot-prop" % "4.2-dt-20181121Z-280c0f",
  "org.scalablytyped" %%% "env-paths" % "2.2.0-d41767",
  "org.scalablytyped" %%% "make-dir" % "3.0.0-15c367",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "pkg-up" % "2.0-dt-20181117Z-3faa45",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-ad46f3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        