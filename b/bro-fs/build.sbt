organization := "org.scalablytyped"
name := "bro-fs"
version := "0.4-dt-20190326Z-8a3e56"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-b613e0",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-d48d39",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        