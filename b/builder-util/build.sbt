organization := "org.scalablytyped"
name := "builder-util"
version := "9.6.0-c6567e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-1e1e38",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-89620d",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-920ba9",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.0.2-124a4a",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-57e2a1",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-872d3d",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-aa651f",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-c0c18a",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-d1333e",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-821f30",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-f2ff47")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        