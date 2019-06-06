organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-d6843f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-fb2478",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-f7e325",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-88b91c",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-99aa20",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-347ccb",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-7d167e",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2854dc",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-ebdc97",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-69e6b4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        