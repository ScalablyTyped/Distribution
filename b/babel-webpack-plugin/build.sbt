organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-94bf7d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-8c26e6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-b740f1",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-e01294",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-41e3e2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-d8607c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-a7770e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-a23328",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-8ac2b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        