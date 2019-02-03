organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-eb17fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-56bf0e",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-6fb03d",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-2ed679",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-b271de",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-104cfe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        