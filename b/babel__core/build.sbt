organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-4bedc0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-e75d0f",
  "org.scalablytyped" %%% "babel__parser" % "7.2.0-0d3601",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-f29883",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-5d0025",
  "org.scalablytyped" %%% "babel__types" % "7.2.0-73ec95",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        