organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-d6a87e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-1e0503",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-84ebbb",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6e1147",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
