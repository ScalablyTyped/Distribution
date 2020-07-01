organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20200515Z-1afeb4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-575632",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-edd1d8",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-2c7cce",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
