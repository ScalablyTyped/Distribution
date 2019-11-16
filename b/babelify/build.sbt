organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-8aec50"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-cf897e",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-57d4e1",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-fc95b0",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-26a4a8",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-62e033",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-889ce7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        