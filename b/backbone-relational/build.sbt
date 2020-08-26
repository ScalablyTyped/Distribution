organization := "org.scalablytyped"
name := "backbone-relational"
version := "0.10-dt-20200515Z-a73e92"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20200612Z-581380",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-02ea23",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-078440",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20200724Z-76d649")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
