organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-e21962"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-f6aa53",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-8fda2a",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-11fcbe",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-1d8974",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9729fa",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-6fb8c9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        