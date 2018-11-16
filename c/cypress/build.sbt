organization := "com.scalablytyped"
name := "cypress"
version := "3.1.0-3da927"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "blob-util" % "1.3-dt-20181102Z-ec44f0",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20181102Z-5bb15d",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181102Z-6ef031",
  "com.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-8fdfc2",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "check-more-types" % "2.24.0-361791",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "commander" % "2.19.0-5a68a9",
  "com.scalablytyped" %%% "common-tags" % "v1.4.0-dt-20181102Z-83ed5c",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "execa" % "0.9-dt-20181102Z-c3c620",
  "com.scalablytyped" %%% "extract-zip" % "1.6-dt-20181102Z-9da051",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181116Z-a46e60",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20181102Z-49c518",
  "com.scalablytyped" %%% "getos" % "3.0-dt-20181102Z-268fd5",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20181102Z-a29095",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181102Z-ef9974",
  "com.scalablytyped" %%% "lazy-ass" % "1.6.0-89b235",
  "com.scalablytyped" %%% "listr" % "0.13-dt-20181102Z-fcd45b",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "log-symbols" % "2.0-dt-20181102Z-d62998",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20181102Z-a716de",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20181102Z-92dac9",
  "com.scalablytyped" %%% "ramda" % "0.25-dt-20181105Z-9ec7cd",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-64050c",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181102Z-677e75",
  "com.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181102Z-882db5",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181102Z-6214b8",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "tmp" % "0.0-dt-20181102Z-236cb1",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181102Z-a43730",
  "com.scalablytyped" %%% "yauzl" % "2.9-dt-20181102Z-69333a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        