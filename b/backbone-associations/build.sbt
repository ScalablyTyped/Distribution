organization := "com.scalablytyped"
name := "backbone-associations"
version := "0.6.4-dt-20180910Z-92d2dc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "backbone" % "1.3.3-dt-20181121Z-b610f3",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-c6ff09",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-99baa3",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-77711f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        