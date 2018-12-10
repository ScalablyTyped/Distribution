organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180910Z-619855"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-3370a7",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-e5beea",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-89cf7d",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-3d1e50",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-396ae2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-16e86f",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-8abbdb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6ade85",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-a6cca8",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3c1589",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-33d6fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        