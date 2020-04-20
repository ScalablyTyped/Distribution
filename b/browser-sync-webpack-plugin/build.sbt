organization := "org.scalablytyped"
name := "browser-sync-webpack-plugin"
version := "2.2-dt-20190722Z-d2768c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "browser-sync" % "2.26-dt-20200226Z-959b1c",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-80b43c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-0c1f94",
  "org.scalablytyped" %%% "source-map" % "0.7.3-61a869",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-7c6f60",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200413Z-ae3cf4",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200418Z-3147f9",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-81ab5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
