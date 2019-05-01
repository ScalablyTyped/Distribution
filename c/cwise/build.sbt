organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-a5ef57"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-df0b85",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-a7dbfb",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-4f0c03",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        