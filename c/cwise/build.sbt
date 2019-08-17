organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-9defb3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-c4f542",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-26b5e6",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-4ed4c1",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        