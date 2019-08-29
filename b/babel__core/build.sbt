organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-150a92"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-c43744",
  "org.scalablytyped" %%% "babel__parser" % "7.5.5-3284f1",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-09f861",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-79df15",
  "org.scalablytyped" %%% "babel__types" % "7.5.5-8dfb7a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        