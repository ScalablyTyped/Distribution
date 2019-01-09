organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-9e2a61"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-27993d",
  "org.scalablytyped" %%% "babel__parser" % "7.2.3-f914d1",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-c37b1d",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-0cde1a",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-59da4d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        