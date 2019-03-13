organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-feaf4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-d44e2f",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-9f9875",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5735e6",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-0d0f7f",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-39373a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-54d1e2",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-d00560")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        