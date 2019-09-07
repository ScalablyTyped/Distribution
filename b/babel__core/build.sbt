organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190904Z-adf9d7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-e015ca",
  "org.scalablytyped" %%% "babel__parser" % "7.5.5-7b2ab4",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-1a9518",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-34ac12",
  "org.scalablytyped" %%% "babel__types" % "7.6.1-90fd38",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        