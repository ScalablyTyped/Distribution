organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190322Z-278c20"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-945854",
  "org.scalablytyped" %%% "knex" % "0.16.5-7818dc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-407536",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        