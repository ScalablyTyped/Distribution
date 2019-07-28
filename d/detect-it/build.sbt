organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-1833c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-73dbc0",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-a6ce83",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-940787",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-5b0aff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        