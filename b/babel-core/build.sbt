organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-103d91"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-a2e5cb",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-c34d5d",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-8e1bb4",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-a5154a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-513adb",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        