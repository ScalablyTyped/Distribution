organization := "com.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181116Z-04f37c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-4afe2d",
  "com.scalablytyped" %%% "babel__parser" % "7.1.6-420594",
  "com.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-5720a7",
  "com.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181116Z-19e8e0",
  "com.scalablytyped" %%% "babel__types" % "7.1.3-ca7889",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        