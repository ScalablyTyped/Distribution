organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-d63a8d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9e3e3f",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-28f1e7",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f93212",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        