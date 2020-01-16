organization := "org.scalablytyped"
name := "datastore-level"
version := "0.14-dt-20191210Z-00e15b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-3d35fc",
  "org.scalablytyped" %%% "interface-datastore" % "0.8-dt-20191210Z-9e9242",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20191206Z-84211b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        