organization := "com.scalablytyped"
name := "backgrid"
version := "0.2.6-dt-20180910Z-e43ef5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-d3d5c5",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-02d7ed",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-87c49b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        