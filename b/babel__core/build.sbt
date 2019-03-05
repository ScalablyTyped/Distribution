organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-9ec441"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-085f53",
  "org.scalablytyped" %%% "babel__parser" % "7.3.4-417566",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-458c0e",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190213Z-e686dd",
  "org.scalablytyped" %%% "babel__types" % "7.3.4-ff6d6e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        