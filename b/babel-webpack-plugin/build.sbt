organization := "com.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180910Z-744a52"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-6ee76b",
  "com.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-f78d7e",
  "com.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-86c2e0",
  "com.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-4e553c",
  "com.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-c44c03",
  "com.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-8e9198",
  "com.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-1ea35d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ddeb4e",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d28d6f",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-c88a69",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        