organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-153a08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-5395f2",
  "org.scalablytyped" %%% "babel__parser" % "7.5.5-b44c98",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-3791de",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-6ec8aa",
  "org.scalablytyped" %%% "babel__types" % "7.5.5-2e899f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        