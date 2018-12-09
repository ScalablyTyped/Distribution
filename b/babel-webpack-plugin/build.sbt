organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180910Z-fac262"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-5af0d9",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-4342f6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-460323",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-2bda5d",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-33cfe0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-7161b6",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-b6545d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-9fb0f3",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-961fa8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        