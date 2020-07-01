organization := "org.scalablytyped"
name := "babel-plugin-macros"
version := "2.8-dt-20200601Z-2f3b3e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20200621Z-d62e5f",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-0c3c05",
  "org.scalablytyped" %%% "babel__parser" % "7.10.4-a561d6",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-4becba",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200601Z-6a71ba",
  "org.scalablytyped" %%% "babel__types" % "7.10.4-f0a684",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
