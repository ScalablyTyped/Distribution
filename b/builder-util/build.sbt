organization := "org.scalablytyped"
name := "builder-util"
version := "9.6.2-127d2b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-7fd281",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-a737ef",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-be5e48",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190221Z-f01776",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-df5024",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-699d18",
  "org.scalablytyped" %%% "chalk" % "2.4.2-413387",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-52c902",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-37a070",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-2ab72d",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9bda5b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-d39187",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-b3c520",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-e0c4f9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-7ff5d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        