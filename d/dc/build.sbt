organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20191210Z-5ac9bb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-1e0503",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6e1147",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-cfa841",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
