organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-9667ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-cea6f1",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-0730d8",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-c63b38",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        