organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-a4bc26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-fb35e6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-3419f6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-311017",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-6bfd56",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-5b73dd",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-a6dbee",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-902380")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        