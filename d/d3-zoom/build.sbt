organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-cab052"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-beed98",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-031a0d",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-8a2abc",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        