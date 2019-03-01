organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-e667a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-16541a",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-116ebc",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-b656eb",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-f34a10",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        