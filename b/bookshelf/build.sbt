organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190524Z-3304f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-d0c235",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-dea030",
  "org.scalablytyped" %%% "knex" % "0.16.5-8cba51",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-e414eb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        