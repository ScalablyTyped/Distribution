organization := "org.scalablytyped"
name := "cypress"
version := "3.1.3-066942"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-5b7725",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-c92fce",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-de9a6d",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-474a7b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "commander" % "2.19.0-89f8ea",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-15f58a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-d65a72",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-6b4b69",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-9e8f6d",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-f5df11",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-88eb4b",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-d01b42",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-c4ac04",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-5e3753",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-459af2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-b40a6d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-e1597c",
  "org.scalablytyped" %%% "moment" % "2.23.0-f391bb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181214Z-07374c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181214Z-33bacc",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-f5c5f8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-655f01",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180226Z-a846da")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        