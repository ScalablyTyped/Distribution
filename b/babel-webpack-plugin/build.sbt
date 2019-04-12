organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-578359"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-a871f2",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-8b9a32",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-745136",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-ddaf22",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-8f048c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-152e86",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-20a77d",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-dc7ba4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        