organization := "com.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-61c531"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-59bdc9",
  "com.scalablytyped" %%% "babel__parser" % "7.1.6-1a32af",
  "com.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-4cdbe9",
  "com.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-7f4dda",
  "com.scalablytyped" %%% "babel__types" % "7.1.6-d152f4",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        