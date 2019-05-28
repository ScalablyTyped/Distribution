organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190524Z-9391f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-8ef956",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-946045",
  "org.scalablytyped" %%% "knex" % "0.16.5-98b790",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-ccc546",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        