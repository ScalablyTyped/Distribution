organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190821Z-bc14ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-44f16d",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-a0439d",
  "org.scalablytyped" %%% "knex" % "0.19.5-ae6a72",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191108Z-c322f2",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        