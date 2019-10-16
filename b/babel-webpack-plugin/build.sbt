organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-8acd95"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-d8ab4b",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-02a822",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-24b74d",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-f33bb5",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-5e9729",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-13ceda",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191009Z-d4c5a7",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-230cbc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        