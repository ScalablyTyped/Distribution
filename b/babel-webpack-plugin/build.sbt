organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-0c668b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-80e6f1",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-f36761",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-d37ec6",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-360144",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-2650a9",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-b465c9",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
