organization := "org.scalablytyped"
name := "babel-jest"
version := "24.9.0-06e2d8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20190904Z-3b9d82",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-6b94b7",
  "org.scalablytyped" %%% "babel__parser" % "7.8.3-4aa425",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-54abd7",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-1b2d04",
  "org.scalablytyped" %%% "babel__types" % "7.8.3-b85d7d",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        