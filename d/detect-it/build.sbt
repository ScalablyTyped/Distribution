organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-92e149"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-62be5d",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-8e13d6",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-61bd47",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-d5eec8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        