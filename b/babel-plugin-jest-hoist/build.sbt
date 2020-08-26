organization := "org.scalablytyped"
name := "babel-plugin-jest-hoist"
version := "26.2.0-eb4181"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20200621Z-84307b",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-f8d0b9",
  "org.scalablytyped" %%% "babel__parser" % "7.11.0-0fe02f",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-a71493",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200706Z-1e5315",
  "org.scalablytyped" %%% "babel__types" % "7.11.0-b7a397",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
