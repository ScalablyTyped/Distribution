organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20200923Z-d90c1b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-cb2a3d",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-08d2f2",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-d7788a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-1e6cb0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-8483b4",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-9e3425",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
