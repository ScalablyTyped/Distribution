organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-de6c77"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-4e56ac",
  "org.scalablytyped" %%% "babel__parser" % "7.5.0-c2b6f6",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-35482a",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-1a7f96",
  "org.scalablytyped" %%% "babel__types" % "7.5.0-2ae92f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        