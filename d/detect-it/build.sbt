organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-30ffac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-6ff4cf",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-04b5bc",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-66c974",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-7d1343")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        