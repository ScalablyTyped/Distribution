organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190524Z-7a2055"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-7a9510",
  "org.scalablytyped" %%% "knex" % "0.17.6-fc7de4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-08a773",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        