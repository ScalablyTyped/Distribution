organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-29b958"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-e37a78",
  "org.scalablytyped" %%% "babel__parser" % "7.4.5-2f1a54",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-90339b",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-be1022",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-127ebc",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        