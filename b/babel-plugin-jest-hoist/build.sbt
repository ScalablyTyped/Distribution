organization := "org.scalablytyped"
name := "babel-plugin-jest-hoist"
version := "26.6.2-a0895f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-6ad8cf",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-ddb884",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-c27ec6",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-8e5288",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-a4f96d",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-603dc7",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
