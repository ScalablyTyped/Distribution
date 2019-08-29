organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-0cb101"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-b78724",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-25ac80",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-11b8cc",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        