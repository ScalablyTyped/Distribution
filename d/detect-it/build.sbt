organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-60e5e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-f08816",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-fa097e",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-cff373",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-4f6513")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        