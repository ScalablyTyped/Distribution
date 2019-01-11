organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-7a1274"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-09ec76",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-9d8b57",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-bbcfa4",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-fde6b2",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-980429",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-69c68c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-22201a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-db8d14",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-11a316",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-689a21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        