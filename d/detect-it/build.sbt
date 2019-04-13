organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-92ff2e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-c7af93",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-9c9ff8",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-5d3eb4",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-e6b18d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        