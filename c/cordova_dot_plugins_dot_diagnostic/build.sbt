organization := "com.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.10-1f76c3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "colors" % "1.3.2-6601c4",
  "com.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181120Z-8b6ea8",
  "com.scalablytyped" %%% "elementtree" % "0.1-dt-20180910Z-0f3309",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        