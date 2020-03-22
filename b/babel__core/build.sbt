organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20200214Z-970daf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-39df76",
  "org.scalablytyped" %%% "babel__parser" % "7.8.6-151a71",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-83bc5a",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-0dc0a6",
  "org.scalablytyped" %%% "babel__types" % "7.8.6-982ae1",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
