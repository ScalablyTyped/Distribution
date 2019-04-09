organization := "org.scalablytyped"
name := "builder-util"
version := "9.7.0-8b29e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-2393db",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-3a9366",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-55a535",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-8f791f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6d3a60",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-fa6979",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-9b420a",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190402Z-168e26",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-12bb56",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-2914ab",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-eadfcf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-e9a2a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        