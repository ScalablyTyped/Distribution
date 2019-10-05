organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-47135e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-5023f1",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-ad7fa8",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-754055",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-bd6ddf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        