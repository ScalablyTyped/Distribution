organization := "org.scalablytyped"
name := "backbone-associations"
version := "0.6.4-dt-20190322Z-af3284"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.4.0-dt-20190514Z-6914de",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f3f7a8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fbd298",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190513Z-e3a487")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        