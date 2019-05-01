organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190404Z-b14ec0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-761cd4",
  "org.scalablytyped" %%% "babel__parser" % "7.4.4-612d6e",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-92c625",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-1fdd3c",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-9751a3",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        