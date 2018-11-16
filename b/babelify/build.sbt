organization := "com.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20181102Z-c4239d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel-core" % "6.25-dt-20181102Z-7c2a76",
  "com.scalablytyped" %%% "babel-generator" % "6.25-dt-20181102Z-76a39c",
  "com.scalablytyped" %%% "babel-template" % "6.25-dt-20181102Z-3cc531",
  "com.scalablytyped" %%% "babel-traverse" % "6.25-dt-20181102Z-605b25",
  "com.scalablytyped" %%% "babel-types" % "7.0-dt-20181102Z-fa77e1",
  "com.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-d4f9b0",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        