organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20200225Z-bf1aec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200225Z-ea946c",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200225Z-70e5fa",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-35059d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
