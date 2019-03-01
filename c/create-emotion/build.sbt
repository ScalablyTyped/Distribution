organization := "org.scalablytyped"
name := "create-emotion"
version := "10.0.7-cd0272"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-169d3a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-5e8565",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-2a2209",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-87741b",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        