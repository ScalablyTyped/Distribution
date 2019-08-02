organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-016c8b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-535952",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-501a1e",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5bfc59",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-9f72a6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-c55b3a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-f0f34f",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-8f1343")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        