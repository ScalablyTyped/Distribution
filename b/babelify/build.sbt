organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-70b82a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-946afb",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-966bdc",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-1bbf1a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-490217",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-e4fb2c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-6df318",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        