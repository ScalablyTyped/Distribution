organization := "com.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181109Z-f7bf65"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20181102Z-8e0f46",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20181102Z-7cad2b",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181116Z-65931c",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-c0a559",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181116Z-a79944",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        