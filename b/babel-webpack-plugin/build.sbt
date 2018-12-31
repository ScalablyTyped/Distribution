organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-621875"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-e20eff",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-b49a2d",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-371fbc",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-6daf00",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-d48c2e",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-1525e1",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-a98e88",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48ad47",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8b616d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-bcc5d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        