organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-0899ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-68f85b",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-de2436",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-44ca08",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-6fd3bd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-dc579b",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-4da460",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-ab1717",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-636f72",
  "org.scalablytyped" %%% "source-map" % "0.7.3-27fa0a",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-e40eb2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-f2b840",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-84e956",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-e0bcef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        