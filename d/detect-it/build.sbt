organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-8c6694"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-7db109",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-d7131b",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-27a123",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-eab40c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        