organization := "org.scalablytyped"
name := "boxen"
version := "3.1.0-17aa9a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-regex" % "4.0-dt-20181220Z-1c76d2",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "camelcase" % "5.3.1-b5994c",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "cli-boxes" % "1.0-dt-20181231Z-e95538",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "emoji-regex" % "7.0-dt-20190212Z-c838af",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "is-fullwidth-code-point" % "3.0.0-bd318a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "string-width" % "4.1.0-5e0468",
  "org.scalablytyped" %%% "strip-ansi" % "5.2.0-0ac2ec",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "term-size" % "1.2-dt-20181215Z-443745",
  "org.scalablytyped" %%% "type-fest" % "0.3.0-45433e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        