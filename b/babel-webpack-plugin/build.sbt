organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-42e574"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-a09216",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-d2db0b",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-c0d92f",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-18b9db",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-157ca0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-619284",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-8c0e04",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-7fb977")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        