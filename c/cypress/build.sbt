organization := "org.scalablytyped"
name := "cypress"
version := "3.1.3-0b10cc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-d9fc7b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-9be48b",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-5fd092",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-b306f3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "commander" % "2.19.0-5e90f1",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181208Z-e5fc0a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-0e9d12",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-133cf5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-888e0e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-731c00",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-9ce17a",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-dd2ba0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-972a1e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-34aac8",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181208Z-ce0324",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-43cb8f",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181120Z-c6a559",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-1c9887",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-6284e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        