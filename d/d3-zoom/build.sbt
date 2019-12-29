organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-7872d0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-67ff91",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-6d1a59",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f5a2c1",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        