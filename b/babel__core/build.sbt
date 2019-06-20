organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-69246e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-6eace7",
  "org.scalablytyped" %%% "babel__parser" % "7.4.5-f1edbb",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-8fa03c",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-059038",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-b76834",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        