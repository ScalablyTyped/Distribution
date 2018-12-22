organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-955378"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-9e8bcf",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-153297",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-df3a50",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-835e54",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-93c34e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        