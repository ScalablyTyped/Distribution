organization := "com.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.10-3582a0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "colors" % "1.3.2-2169a3",
  "com.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181102Z-07d75d",
  "com.scalablytyped" %%% "elementtree" % "0.1-dt-20181102Z-175a39",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        