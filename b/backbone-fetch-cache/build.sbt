organization := "org.scalablytyped"
name := "backbone-fetch-cache"
version := "1.4-dt-20200515Z-4e2b08"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20200515Z-d9643d",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200515Z-5d5c16",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-b4597c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20200515Z-647b59")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
