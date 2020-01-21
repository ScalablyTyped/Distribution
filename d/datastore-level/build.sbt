organization := "org.scalablytyped"
name := "datastore-level"
version := "0.14-dt-20191210Z-e9b600"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-3caee8",
  "org.scalablytyped" %%% "interface-datastore" % "0.8-dt-20191210Z-73a79c",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20191206Z-7b3fb3",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        