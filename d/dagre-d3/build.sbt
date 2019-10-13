organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20190212Z-d5c844"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6237a2",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-4c3557",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190430Z-77c567",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        