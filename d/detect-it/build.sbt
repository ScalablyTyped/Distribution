organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-4968bf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-54c810",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-9a5bbc",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-38013c",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-324b01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        