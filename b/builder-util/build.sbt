organization := "org.scalablytyped"
name := "builder-util"
version := "22.3.2-118b7e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.6.0-61a3f3",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-552094",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-c39e96",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "temp-file" % "3.3.6-690c51")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
