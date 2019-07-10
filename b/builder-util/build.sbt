organization := "org.scalablytyped"
name := "builder-util"
version := "10.1.2-097810"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-8aa727",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-d7c1c4",
  "org.scalablytyped" %%% "fs-extra-p" % "8.1.0-c25383",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-a50bf7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        