organization := "com.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181105Z-2357b8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-0414a8",
  "com.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-fe257d",
  "com.scalablytyped" %%% "d3-selection" % "1.3-dt-20181120Z-74ec8f",
  "com.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-37f57d",
  "com.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181120Z-bc3297",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        