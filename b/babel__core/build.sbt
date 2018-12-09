organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-e7cb8c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-ea0da9",
  "org.scalablytyped" %%% "babel__parser" % "7.2.0-f6e144",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-8aad21",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-94c3c3",
  "org.scalablytyped" %%% "babel__types" % "7.2.0-82b65c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        