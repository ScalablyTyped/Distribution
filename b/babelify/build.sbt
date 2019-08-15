organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-d3d79c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-535952",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-501a1e",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5bfc59",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-9f72a6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-c55b3a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-f0f34f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        