organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-723182"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-3be82b",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-857677",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-4b2b71",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-57a93a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-b271d4",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-59877a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-b49145",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-1d4d44",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-280313",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-2b3f1b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        