organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-18cf18"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-de01b5",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-ee164f",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-55be8b",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-d76ae8",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-65f6d4",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2e02b0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-278dfd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        