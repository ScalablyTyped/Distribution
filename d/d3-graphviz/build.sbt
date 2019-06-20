organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-eadb62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-828f81",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-65a2c4",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-f51f62",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6ffed1",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d265ec",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        