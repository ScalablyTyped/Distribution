organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-9517c9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-67ec4a",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-b7ecfd",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-a45b47",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-9100c7",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        