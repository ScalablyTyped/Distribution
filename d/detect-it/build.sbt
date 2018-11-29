organization := "com.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180910Z-a53e63"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "detect-hover" % "1.0-dt-20180910Z-5cc989",
  "com.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180910Z-46f391",
  "com.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180910Z-61990b",
  "com.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180910Z-97c88e",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        