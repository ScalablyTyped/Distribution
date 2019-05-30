organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-c8bd37"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-f9d753",
  "org.scalablytyped" %%% "babel__parser" % "7.4.5-179093",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-c974a3",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-84082a",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-f56178",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        