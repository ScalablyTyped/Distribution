organization := "org.scalablytyped"
name := "builder-util"
version := "21.2.0-05ab98"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-f92784",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-56a6ae",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20190626Z-d7f314",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-7311a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        