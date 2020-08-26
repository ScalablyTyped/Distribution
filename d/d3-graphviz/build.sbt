organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20200103Z-3dab22"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-17facc",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-1b2311",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-7b7f3a",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-06118c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200515Z-304279",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
