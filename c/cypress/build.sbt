organization := "org.scalablytyped"
name := "cypress"
version := "4.4.0-7d7841"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-5cd42f",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20200226Z-749d68",
  "org.scalablytyped" %%% "eventemitter2" % "6.3.1-87c2f0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200417Z-b4ce9c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-23b1d1",
  "org.scalablytyped" %%% "mocha" % "7.0-dt-20200303Z-56b2b6",
  "org.scalablytyped" %%% "moment" % "2.24.0-677241",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200331Z-ce0e6f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-844029",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
