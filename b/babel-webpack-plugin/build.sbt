organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-9e6ea3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-ffeb0a",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-8c103e",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-db8540",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-40bd73",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-04aca8",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-127b50",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-dd20a8",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "source-map" % "0.7.3-52dc03",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-4cd4ea",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ba58e2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-5cab92")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        