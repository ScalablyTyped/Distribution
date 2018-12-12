organization := "org.scalablytyped"
name := "backbone_dot_marionette"
version := "3.3-dt-20181121Z-777560"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-d3c228",
  "org.scalablytyped" %%% "backbone_dot_radio" % "v0.8.3-dt-20181121Z-c70e81",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181212Z-994342",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-057dfb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        