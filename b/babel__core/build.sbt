organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190904Z-05a8e0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20190924Z-57d8bb",
  "org.scalablytyped" %%% "babel__parser" % "7.6.4-93e16f",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-40581e",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-fe90e3",
  "org.scalablytyped" %%% "babel__types" % "7.6.3-4c2655",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        