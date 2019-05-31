organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-882b0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-f7e325",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-88b91c",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-99aa20",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-347ccb",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-7d167e",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2854dc",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        