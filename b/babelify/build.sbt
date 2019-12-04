organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-b56f02"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-b9ef91",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-89fa54",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-07a039",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-1d1164",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-7d801c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-18a705",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        