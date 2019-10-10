organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190821Z-4dfe3b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0961f2",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-cb56d8",
  "org.scalablytyped" %%% "knex" % "0.19.5-fdcdf1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-bce92f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        