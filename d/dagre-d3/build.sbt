organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20200226Z-bec120"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-a53e09",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200225Z-337cf0",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20200320Z-e8b14d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
