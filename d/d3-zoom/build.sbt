organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20200225Z-201160"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200225Z-68713f",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200225Z-c31b4a",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-a53e09",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
