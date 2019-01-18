organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-2a49ee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-3a1f6b",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-9b919e",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-ffce8f",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-93327a",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-c69f9b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        