organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-1c6e89"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-937e2d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-deca74",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-c42062",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        