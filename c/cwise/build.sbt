organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-98330c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-1e6e69",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-673b6f",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-b19db9",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        