organization := "org.scalablytyped"
name := "backbone_dot_layoutmanager"
version := "0.9.5-dt-20181116Z-9b30af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181124Z-e0cf68",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-ec51da",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-9e9c07",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-20fef5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        