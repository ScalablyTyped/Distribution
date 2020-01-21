organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.0.1-dt-20191209Z-b91bf7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-d528a7",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-c222bc",
  "org.scalablytyped" %%% "knex" % "0.19.5-6a93f9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7b0fe5",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        