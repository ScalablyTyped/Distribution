organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-48e043"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20190322Z-9e0d7a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-0e06e5",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-dce26a",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        