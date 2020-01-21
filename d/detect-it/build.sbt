organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-9592c0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-436ecc",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-8dd0c8",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-dfb8cf",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-028d2e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        