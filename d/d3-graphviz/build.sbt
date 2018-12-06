organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181105Z-a1094f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-63ebbb",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-11b81b",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-aaebc1",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-c54eec",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181206Z-8f507d",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        