organization := "org.scalablytyped"
name := "babel__standalone"
version := "7.1-dt-20191216Z-61a5f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20190904Z-999a75",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-bacbaa",
  "org.scalablytyped" %%% "babel__parser" % "7.7.7-1912f6",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-b7e0bf",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-26132f",
  "org.scalablytyped" %%% "babel__types" % "7.7.4-c44201",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        