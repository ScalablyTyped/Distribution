organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-e5bdb0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-93cb26",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-4eeff5",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-a0ab55",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-9eacff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
