organization := "com.scalablytyped"
name := "d3-sankey"
version := "0.7-dt-20181116Z-b19f0e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20181102Z-4d199e",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-dbee18",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        