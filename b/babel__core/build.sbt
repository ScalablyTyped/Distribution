organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190404Z-33b6f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-7e7b27",
  "org.scalablytyped" %%% "babel__parser" % "7.4.4-8d9ef6",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-9df7cd",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-4c9024",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-fe554a",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        