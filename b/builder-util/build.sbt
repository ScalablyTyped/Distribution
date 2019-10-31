organization := "org.scalablytyped"
name := "builder-util"
version := "21.2.0-9791a9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.3.0-a4e737",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-3d3404",
  "org.scalablytyped" %%% "fs-extra" % "8.0-dt-20191016Z-ce00b3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "temp-file" % "3.3.4-8963f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        