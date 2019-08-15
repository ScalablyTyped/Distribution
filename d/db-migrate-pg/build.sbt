organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20190524Z-35a17d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-2c5248",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20190524Z-1af4c2",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-b6bf54",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-5df631",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        