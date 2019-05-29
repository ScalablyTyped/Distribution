organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-8ad14d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-0e9f0a",
  "org.scalablytyped" %%% "babel__parser" % "7.4.5-df9d82",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-71b2b1",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-4fe871",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-f4a631",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        