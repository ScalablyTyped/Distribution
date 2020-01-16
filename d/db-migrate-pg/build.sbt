organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20190524Z-a8332f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20190524Z-1eca4b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20200103Z-860428",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20191101Z-8bd2f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        