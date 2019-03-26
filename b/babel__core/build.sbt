organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-bc5ccb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-8a7b17",
  "org.scalablytyped" %%% "babel__parser" % "7.4.2-65b2e7",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-55aeed",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-8ca85f",
  "org.scalablytyped" %%% "babel__types" % "7.4.0-f05819",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        