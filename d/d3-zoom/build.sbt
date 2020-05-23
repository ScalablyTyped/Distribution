organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20200515Z-3269b2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-bf03a2",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-4d1515",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-63e92d",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
