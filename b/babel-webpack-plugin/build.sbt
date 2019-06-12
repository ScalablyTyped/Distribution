organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-1e540b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-375ab8",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-d691e0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-a435ba",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5e2e26",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c9e977",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-a0f0bc",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-508671",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "source-map" % "0.7.3-b05be9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f9cdac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e377d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-9a1e13")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        