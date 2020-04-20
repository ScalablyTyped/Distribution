organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-11aa20"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-e5861a",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-574d4e",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-e58d52",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-270e5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
