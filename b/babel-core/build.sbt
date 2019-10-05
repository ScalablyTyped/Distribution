organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-310876"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-234455",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-e1d3ae",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-5716e5",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-31c637",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-5a5b3e",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        