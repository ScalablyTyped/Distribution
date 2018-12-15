organization := "org.scalablytyped"
name := "cypress"
version := "3.1.3-056f8b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-8dc6ca",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-afd95f",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-4d9f17",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-a15065",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "commander" % "2.19.0-b7449f",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181208Z-ee6c7e",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-da83de",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-6a4b04",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-0bceb0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-3a9571",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181214Z-7b71e9",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-aac949",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-ca3ef0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-40540a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-3ebcb3",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181215Z-c5c36e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181213Z-3ccc57",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181213Z-ea75ce",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-e65330",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-74e7c2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-006182")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        