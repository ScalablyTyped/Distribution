organization := "org.scalablytyped"
name := "backbone_dot_marionette"
version := "3.3-dt-20190927Z-0445dc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-79e106",
  "org.scalablytyped" %%% "backbone_dot_radio" % "0.8-dt-20190619Z-cc351f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-2d3992",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-ec5a0d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
