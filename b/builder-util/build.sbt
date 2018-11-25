organization := "com.scalablytyped"
name := "builder-util"
version := "6.1.3-c34349"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "7zip-bin" % "4.0.2-784e37",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "app-builder-bin" % "2.1.2-c7ff6d",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.5-f4447e",
  "com.scalablytyped" %%% "builder-util-runtime" % "4.4.1-29b152",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-9b03c0",
  "com.scalablytyped" %%% "fs-extra-p" % "4.6.1-909f0f",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-bb32bb",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-501d39",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-870ec2",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-eae856",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-edffa1",
  "com.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-04c019",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "temp-file" % "3.1.3-5f88d0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        