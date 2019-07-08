organization := "org.scalablytyped"
name := "boxen"
version := "4.1.0-2471ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cli-boxes" % "2.2.0-72464f",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-312d32")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        