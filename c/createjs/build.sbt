organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20190322Z-f60f9c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20190322Z-bb8577",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20190322Z-613fdd",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20190322Z-90e3c4",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20190322Z-4a96c5",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20190322Z-d0d081")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        