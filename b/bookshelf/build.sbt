organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190821Z-91a344"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-a0439d",
  "org.scalablytyped" %%% "knex" % "0.19.5-ee4123",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191118Z-0a5f57",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        