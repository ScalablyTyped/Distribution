organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-365567"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-68428c",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-808fce",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-aca48e",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-0a75bc",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        