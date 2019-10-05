organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190904Z-d13257"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20190924Z-9fd1b7",
  "org.scalablytyped" %%% "babel__parser" % "7.6.2-64dabd",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-f1cc09",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-1736fd",
  "org.scalablytyped" %%% "babel__types" % "7.6.1-9c3ffe",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        