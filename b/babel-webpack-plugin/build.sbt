organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-6affbd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-cf897e",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-57d4e1",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-fc95b0",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-26a4a8",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-62e033",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-889ce7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-828d98",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-3df8e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        