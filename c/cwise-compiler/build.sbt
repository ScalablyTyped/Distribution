organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20180214Z-096ec3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-a75f20",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-3c8fd1",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        