organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-8582f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-0fd92b",
  "org.scalablytyped" %%% "babel__parser" % "7.5.0-6723c5",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-e7c732",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-7398e9",
  "org.scalablytyped" %%% "babel__types" % "7.5.0-399efd",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        