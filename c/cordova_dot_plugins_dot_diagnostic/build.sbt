organization := "org.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.10-dd754e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "colors" % "1.3.3-da772f",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181120Z-92ffd8",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180910Z-b76a1e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        