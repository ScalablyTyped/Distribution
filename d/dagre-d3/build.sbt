organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20190212Z-c57a88"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-db38c1",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-3df0c6",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190430Z-d8b88d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        