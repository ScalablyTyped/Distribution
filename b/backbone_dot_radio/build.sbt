organization := "org.scalablytyped"
name := "backbone_dot_radio"
version := "0.8-dt-20190619Z-4d6043"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-885989",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-2b422f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2bc54f",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-99dc01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        