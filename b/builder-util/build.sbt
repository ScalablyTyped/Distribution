organization := "org.scalablytyped"
name := "builder-util"
version := "9.6.0-65a204"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-78a6d7",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.0-1456ae",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-460360",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-50ced7",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-f3b2ad",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-c8e76c",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-c063b2",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-126416",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-fbdddb",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180910Z-15484d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-8c448e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        