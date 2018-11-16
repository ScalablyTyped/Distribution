organization := "com.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181116Z-3037a0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-b92808",
  "com.scalablytyped" %%% "babel__parser" % "7.1.6-d16b04",
  "com.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-b14a28",
  "com.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181116Z-0bca71",
  "com.scalablytyped" %%% "babel__types" % "7.1.3-77f3a9",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        