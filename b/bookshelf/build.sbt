organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.0.1-dt-20200128Z-ab0d45"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-2fc7af",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-56757a",
  "org.scalablytyped" %%% "knex" % "0.20.10-b0431e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-8af6d1",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tarn" % "2.0.0-ca783e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
