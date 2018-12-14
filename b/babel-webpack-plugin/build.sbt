organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180910Z-eae272"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-940dc4",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-de22fd",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-aa3462",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-0da97a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-ece9ab",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-8188a5",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-2494b0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ea4dd1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d845d1",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-208f59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        