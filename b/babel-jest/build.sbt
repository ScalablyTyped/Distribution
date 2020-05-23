organization := "org.scalablytyped"
name := "babel-jest"
version := "24.9.0-446d48"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20200515Z-35076c",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-410e65",
  "org.scalablytyped" %%% "babel__parser" % "7.9.6-2ddbcd",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-ede675",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200515Z-f93685",
  "org.scalablytyped" %%% "babel__types" % "7.9.6-a10d47",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
