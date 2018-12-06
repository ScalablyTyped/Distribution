organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180910Z-8e571a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180910Z-f38a74",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180910Z-e578b5",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180910Z-f2c31b",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180910Z-e48378",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        