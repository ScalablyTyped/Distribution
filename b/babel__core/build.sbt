organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-d3ef5e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-c48785",
  "org.scalablytyped" %%% "babel__parser" % "7.4.5-0d68ec",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-f0362f",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-204760",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-110132",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        