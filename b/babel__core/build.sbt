organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20200214Z-f856eb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-daf3be",
  "org.scalablytyped" %%% "babel__parser" % "7.8.4-7717a8",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-e96421",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-082424",
  "org.scalablytyped" %%% "babel__types" % "7.8.3-09621e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
