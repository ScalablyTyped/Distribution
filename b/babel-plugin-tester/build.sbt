organization := "org.scalablytyped"
name := "babel-plugin-tester"
version := "9.0-dt-20200924Z-99ef8c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-24c0b0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-00139b",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-cda1da",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-902e2a",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-f2e997",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-2e813b",
  "org.scalablytyped" %%% "prettier" % "2.1-dt-20201016Z-d49687",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
