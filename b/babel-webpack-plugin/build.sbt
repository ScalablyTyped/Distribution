organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-4df7df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c26764",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-178cd1",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-9d01b7",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-c0d801",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-4730a6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9e4e59",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-652b9f",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6cb46e",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6fe94b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a6952d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-0cf455")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        