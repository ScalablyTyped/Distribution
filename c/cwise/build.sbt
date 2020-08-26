organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20200515Z-5ec8f4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20200515Z-000d4b",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20200515Z-cb2fda",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20200515Z-edf103",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
