organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-d8e0db"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-4a9bea",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-e80aad",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-6dcbe1",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-b3e13d",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-1e99d9",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-6813d5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        