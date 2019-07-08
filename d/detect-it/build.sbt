organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-163014"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-a113e0",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-a5f7e0",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-0add03",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-377445")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        