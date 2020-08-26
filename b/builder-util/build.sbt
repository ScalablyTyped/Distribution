organization := "org.scalablytyped"
name := "builder-util"
version := "22.8.0-15b415"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-e019b1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-1db63e",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20200519Z-aea638",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-466aa8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
