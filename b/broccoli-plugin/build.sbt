organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "3.1.0-e67255"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-d26b7d",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "2.0.0-a5a3e7",
  "org.scalablytyped" %%% "fs-merger" % "3.0.2-b357ac",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "walk-sync" % "0.3.4-1c28b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        