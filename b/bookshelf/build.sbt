organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.0.1-dt-20191209Z-e49e5d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-986975",
  "org.scalablytyped" %%% "knex" % "0.19.5-c59d3b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-5c26cb",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        