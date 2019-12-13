organization := "org.scalablytyped"
name := "babel-plugin-macros"
version := "2.6-dt-20191016Z-528a90"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20190904Z-34ad35",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-57edb1",
  "org.scalablytyped" %%% "babel__parser" % "7.7.5-d38f9e",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-094308",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-2fbc3c",
  "org.scalablytyped" %%% "babel__types" % "7.7.4-b20a9f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        