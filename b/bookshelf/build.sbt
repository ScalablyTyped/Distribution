organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.1.1-dt-20200410Z-6db759"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-5cd42f",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20200225Z-4febcd",
  "org.scalablytyped" %%% "knex" % "0.20.15-d8aa1f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200417Z-b4ce9c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tarn" % "2.0.0-38004c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
