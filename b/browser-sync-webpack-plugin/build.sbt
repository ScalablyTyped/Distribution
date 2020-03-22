organization := "org.scalablytyped"
name := "browser-sync-webpack-plugin"
version := "2.2-dt-20190722Z-099229"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "browser-sync" % "2.26-dt-20190819Z-273809",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-c1eb4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-2b8189",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-452939")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
