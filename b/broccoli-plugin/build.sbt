organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "3.1.0-a45386"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-61cd92",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "2.0.0-a97d50",
  "org.scalablytyped" %%% "fs-merger" % "3.0.2-5b01cf",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "walk-sync" % "0.3.4-572b62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        