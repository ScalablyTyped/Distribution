organization := "org.scalablytyped"
name := "d3-zoom"
version := "1.7-dt-20190212Z-85b977"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-f5dffe",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-28a917",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-7ad803",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        