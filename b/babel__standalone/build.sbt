organization := "org.scalablytyped"
name := "babel__standalone"
version := "7.1-dt-20200318Z-e1b63f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20200331Z-c8f9ae",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-768741",
  "org.scalablytyped" %%% "babel__parser" % "7.9.4-b48704",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-24a8aa",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200406Z-1e6f42",
  "org.scalablytyped" %%% "babel__types" % "7.9.5-7efe61",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
