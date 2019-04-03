organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-acf94b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-729e5d",
  "org.scalablytyped" %%% "babel__parser" % "7.4.3-3c3da9",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-f33be5",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-e41437",
  "org.scalablytyped" %%% "babel__types" % "7.4.0-3767f4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        