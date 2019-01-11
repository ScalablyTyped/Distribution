organization := "org.scalablytyped"
name := "backbone_dot_marionette"
version := "3.3-dt-20181121Z-d45b3c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181124Z-4c1b47",
  "org.scalablytyped" %%% "backbone_dot_radio" % "v0.8.3-dt-20181121Z-ce0196",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d30f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-316a8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        