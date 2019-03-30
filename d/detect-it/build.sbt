organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-7b6a35"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-8328d5",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-4f12c1",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-56ddac",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-9a02e1",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        