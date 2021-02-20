organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.6-dt-20201118Z-d652d5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-c00acc",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20200507Z-b3a227",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20201002Z-11b0bd",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
