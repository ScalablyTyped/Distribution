organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-b8a215"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d73b57",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-5f4950",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-5df629",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-3697ff",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-e17a99",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-7ad93b",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-010229",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-59c854",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-4f8c7c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-9215f6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        