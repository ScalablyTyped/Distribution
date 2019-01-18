organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-547780"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-740833",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-d84e88",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-3f8077",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-9ba52f",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        