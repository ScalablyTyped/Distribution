organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20200515Z-e8fb7c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-f0e16d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-996f31",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-959b5c",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
