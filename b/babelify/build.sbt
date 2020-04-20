organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20200225Z-a0f558"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-9f8b47",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200226Z-55fabe",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-4c6d91",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-23fe48",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-187f96",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-aad46b",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
