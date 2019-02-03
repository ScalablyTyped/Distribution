organization := "org.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.11-768c4d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "colors" % "1.3.3-e74c64",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-a87693",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-4844fa",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        