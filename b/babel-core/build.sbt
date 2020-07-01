organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20200226Z-7ab57b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-d091e4",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-1a309c",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-0a2d06",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200515Z-1f4d99",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-60cee6",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
