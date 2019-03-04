organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-c36b1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-bb8f3f",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-bc93a2",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-3ff2d3",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-804f5a",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-aac116")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        