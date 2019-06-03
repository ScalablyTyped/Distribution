organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190524Z-4604a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-462670",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-752f4b",
  "org.scalablytyped" %%% "knex" % "0.17.3-44a460",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190531Z-4abba9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        