organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-d4d6bb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-bb8577",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-689891",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-b73f8c",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-1360fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-9381d8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        