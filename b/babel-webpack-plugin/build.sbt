organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-ff3740"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-9f5616",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-cc28b6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-876ed7",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-60931b",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-afe7cd",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-29523a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c2e5ed",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5fcf02",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-1cc7c8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        