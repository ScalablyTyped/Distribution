organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-38ec1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-da80b1",
  "org.scalablytyped" %%% "babel__parser" % "7.3.4-0ecd4a",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-d47f4d",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190213Z-5988e4",
  "org.scalablytyped" %%% "babel__types" % "7.3.4-590233",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        