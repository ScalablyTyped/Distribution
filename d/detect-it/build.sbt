organization := "com.scalablytyped"
name := "detect-it"
version := "2.1-dt-20181102Z-cf4266"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "detect-hover" % "1.0-dt-20181102Z-533c52",
  "com.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20181102Z-5d5829",
  "com.scalablytyped" %%% "detect-pointer" % "1.0-dt-20181102Z-0708b6",
  "com.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20181102Z-27e09d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        