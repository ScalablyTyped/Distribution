organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-05b3d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-178cd1",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-9d01b7",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-c0d801",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-4730a6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9e4e59",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-652b9f",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        