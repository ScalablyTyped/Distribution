organization := "org.scalablytyped"
name := "cypress"
version := "3.1.3-73ad82"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-be4072",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-dcf8bd",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-f86712",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-13bd84",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-244ea2",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "commander" % "2.19.0-d3bb02",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181208Z-4a5aee",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-4e3892",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-9a70c4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-c69c6e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-57e2a1",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-ec61dc",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-aa651f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-928df5",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-6b9d6b",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-bd1433",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-394a68",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-d21498",
  "org.scalablytyped" %%% "moment" % "2.22.2-d1dfb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181208Z-2c136e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6fc249",
  "org.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-e48a96",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181120Z-2333cf",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-081654",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-2d8064",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-2a8335")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        