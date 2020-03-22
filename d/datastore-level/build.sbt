organization := "org.scalablytyped"
name := "datastore-level"
version := "0.14-dt-20191210Z-4fe2f1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-92a054",
  "org.scalablytyped" %%% "interface-datastore" % "0.8-dt-20191210Z-bcf211",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20191206Z-2b996d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
