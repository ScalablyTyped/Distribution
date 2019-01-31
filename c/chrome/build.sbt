organization := "org.scalablytyped"
name := "chrome"
version := "0.0-unknown-dt-20190111Z-1b98df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-7f7010",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-4a8703",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        