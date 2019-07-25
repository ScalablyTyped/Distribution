organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-055291"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-630d1b",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-019623",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-6f9e55",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-86376c",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-88069f",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-98b295",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-ae970d",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "source-map" % "0.7.3-11ec74",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-a00acf",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8dc4d2",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-931598")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        