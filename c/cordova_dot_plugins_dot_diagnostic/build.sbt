organization := "org.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.12-a70870"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "colors" % "1.3.3-e308da",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20190322Z-2f3d70",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-d35a5a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        