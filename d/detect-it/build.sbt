organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20200515Z-d3ef54"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20200515Z-b1582b",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20200515Z-8749f7",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20200515Z-1f2508",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20200515Z-7332f4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
