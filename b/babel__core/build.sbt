organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-ec91b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-8ce8b5",
  "org.scalablytyped" %%% "babel__parser" % "7.2.3-9501dc",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-fdd38a",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-e85cf0",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-7c580b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        