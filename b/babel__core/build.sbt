organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190904Z-f6083d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20190924Z-585ebd",
  "org.scalablytyped" %%% "babel__parser" % "7.7.4-060c9d",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-3267d1",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-3945cd",
  "org.scalablytyped" %%% "babel__types" % "7.7.4-15410d",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        