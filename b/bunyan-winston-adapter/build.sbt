organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20200515Z-433a47"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-642e90",
  "org.scalablytyped" %%% "logform" % "2.2.0-0b1340",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "winston" % "3.3.3-68a4f4",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-18c555")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
