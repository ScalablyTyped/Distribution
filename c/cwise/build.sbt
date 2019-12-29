organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-eaa65a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-cd45ab",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-37a38a",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-fdd86c",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        