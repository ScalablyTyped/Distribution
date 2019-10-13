organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20190524Z-7aea36"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-347560",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20190524Z-eb7e0f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "pg" % "7.11-dt-20190926Z-11d65b",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-bacb55",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        