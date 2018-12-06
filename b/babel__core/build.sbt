organization := "com.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-b8a72d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-e4de06",
  "com.scalablytyped" %%% "babel__parser" % "7.2.0-c05681",
  "com.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-cbb1f3",
  "com.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-e82371",
  "com.scalablytyped" %%% "babel__types" % "7.2.0-7f6146",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        