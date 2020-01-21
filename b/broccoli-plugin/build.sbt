organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "3.1.0-a56a76"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-e26fbf",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "2.0.0-0464cf",
  "org.scalablytyped" %%% "fs-merger" % "3.0.2-5702b5",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "walk-sync" % "0.3.4-6bdc8e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        