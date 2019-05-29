organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20190524Z-343804"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-d0c235",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20190524Z-4d4f04",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-217971",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-d1ef24",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        