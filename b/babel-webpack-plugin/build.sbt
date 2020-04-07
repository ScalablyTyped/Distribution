organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-11946b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-c580f8",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200226Z-b71d20",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-644ddd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c08bce",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-441850",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-5f14cf",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20200225Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200320Z-cabf96",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200225Z-fed209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
