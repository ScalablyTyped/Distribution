organization := "com.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180910Z-40432d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "detect-hover" % "1.0-dt-20180910Z-9aac51",
  "com.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180910Z-5ded80",
  "com.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180910Z-e76620",
  "com.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180910Z-25d65d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        