organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20200515Z-0da934"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20200515Z-c50434",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20200515Z-7fb047",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20200515Z-b70ef2",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20200515Z-4cf49c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
