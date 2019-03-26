organization := "org.scalablytyped"
name := "boxen"
version := "3.0.0-6b3676"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "camelcase" % "5.2.0-c0d61b",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "cli-boxes" % "1.0-dt-20181231Z-00c90b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-2d8f3d",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "term-size" % "1.2-dt-20181215Z-a13ba1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        