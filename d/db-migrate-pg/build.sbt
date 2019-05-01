organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20190322Z-df0a7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20190322Z-d80b6d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-fa86ec",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-8e80c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        