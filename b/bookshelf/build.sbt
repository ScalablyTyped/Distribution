organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.9.4-dt-20181116Z-013e4d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20180315Z-2f050e",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-71abe5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        