organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.3-785a4a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-f0c939",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.1-2c3ad6",
  "org.scalablytyped" %%% "fs-merger" % "3.1.0-84b525",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-d64372",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "walk-sync" % "2.0.2-6a0568")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
