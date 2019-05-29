organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-fa1943"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c668e9",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-8944de",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-433e24",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-15156c",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-739ba1",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-39b2de",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-c6b3f1",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4c9904",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c234c0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-db399f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-c79d12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        