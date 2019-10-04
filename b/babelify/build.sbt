organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-e90555"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-8c26e6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-b740f1",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-e01294",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-41e3e2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-d8607c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-a7770e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        