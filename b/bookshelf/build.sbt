organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.1.1-dt-20200515Z-a8510f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-32ab28",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20200515Z-7078dc",
  "org.scalablytyped" %%% "knex" % "0.20.15-047430",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200519Z-0dc149",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tarn" % "2.0.0-3dad89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
