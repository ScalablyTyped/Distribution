organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20200226Z-f9dba7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-ee0042",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-b03dcd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-535fd7",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200515Z-349e2d",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-f6c467",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
