organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20200515Z-f16cd0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20200515Z-3e8c33",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20200515Z-6db720",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20200515Z-4f88b6",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20200515Z-23b64c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
