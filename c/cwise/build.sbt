organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-bc4dba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-7beadc",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-a184c4",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-1847fc",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        