organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190524Z-3e9da9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-cca586",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-c7bd16",
  "org.scalablytyped" %%% "knex" % "0.17.5-de5228",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-ca1840",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        