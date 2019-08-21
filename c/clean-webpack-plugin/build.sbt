organization := "org.scalablytyped"
name := "clean-webpack-plugin"
version := "3.0.0-034970"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-44bb30",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-2a8016",
  "org.scalablytyped" %%% "source-map" % "0.7.3-20fa05",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-8d90ab",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a7321d",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190819Z-ce1355",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-a8f7f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        