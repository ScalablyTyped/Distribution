organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-11be76"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a09216",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-640208",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-0ca4b1",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-42c2c0",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-052fbc",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190212Z-619284",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2d5b7a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-7472f2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        