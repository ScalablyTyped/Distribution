organization := "org.scalablytyped"
name := "builder-util"
version := "9.6.2-a90025"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-422126",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-9c42be",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-7ee39d",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-48e1b7",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-811058",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-b2f055",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-ded1c2",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-46c2c8",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-6bff05",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-b141fd",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-9f398b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        