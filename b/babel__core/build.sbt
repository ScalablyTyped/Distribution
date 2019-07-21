organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-098bab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-268892",
  "org.scalablytyped" %%% "babel__parser" % "7.5.5-767176",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-6806d3",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-b445d2",
  "org.scalablytyped" %%% "babel__types" % "7.5.5-0d8dcf",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        