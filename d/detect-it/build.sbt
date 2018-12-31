organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-d3c167"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-a9ac42",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-02bc2d",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-95c5f0",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-b2007b",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        