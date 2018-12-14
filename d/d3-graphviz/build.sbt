organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181105Z-c5ae8f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-c4d7c3",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-d0b670",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-872689",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-a66333",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181213Z-1e3e8a",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        