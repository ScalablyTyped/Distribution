organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-a55b07"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-9cd098",
  "org.scalablytyped" %%% "babel__parser" % "7.2.0-d32db4",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-640e69",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-6f6cc4",
  "org.scalablytyped" %%% "babel__types" % "7.2.0-ca14ff",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        