organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190904Z-c70a0c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20190924Z-6fff3c",
  "org.scalablytyped" %%% "babel__parser" % "7.7.3-860194",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-5b5795",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-3752eb",
  "org.scalablytyped" %%% "babel__types" % "7.7.2-1b8c49",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        