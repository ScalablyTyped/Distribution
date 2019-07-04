organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-e91ae4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-228aa6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-f6aa53",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-8fda2a",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-11fcbe",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-1d8974",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9729fa",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-6fb8c9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4aa868",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-89a0aa",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-fae9fa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190624Z-e61854")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        