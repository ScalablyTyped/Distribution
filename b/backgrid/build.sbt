organization := "org.scalablytyped"
name := "backgrid"
version := "0.2-dt-20190619Z-b37e02"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-520270",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190711Z-947f04",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b6c899",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-e9a902")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        