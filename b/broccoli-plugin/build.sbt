organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.2-776622"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-6ca605",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.1-2c0bbf",
  "org.scalablytyped" %%% "fs-merger" % "3.0.2-9b33c7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-23b1d1",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "walk-sync" % "2.0.2-27b485")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
