organization := "org.scalablytyped"
name := "builder-util"
version := "10.1.2-e2639f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.5-a22a2b",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-9902a3",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-40eb2e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "temp-file" % "3.3.3-92f2eb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        