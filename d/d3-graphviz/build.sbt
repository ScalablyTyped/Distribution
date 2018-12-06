organization := "com.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181105Z-f29cc3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-4cd0f3",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-a45541",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-ca857a",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-b92139",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181206Z-d28326",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        