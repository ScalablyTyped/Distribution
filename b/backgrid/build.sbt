organization := "org.scalablytyped"
name := "backgrid"
version := "0.2.6-dt-20180214Z-6ff2b9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181124Z-a8327a",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f7f24f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b20ceb",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-364b75")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        