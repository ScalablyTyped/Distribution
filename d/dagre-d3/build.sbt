organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20190212Z-4f5cf3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-1b2f80",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-15c2dd",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190430Z-e542f6",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        