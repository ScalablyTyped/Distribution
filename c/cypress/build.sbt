organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-37fcb4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-a737ef",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-6a3164",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-1eef62",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-e0d41f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-413387",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-88f6f7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "commander" % "2.19.0-c41a23",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-d8b25d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190213Z-fec855",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-54377a",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-0f9a00",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0cec79",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-c19f1d",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-f69e69",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e20e66",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-2ab72d",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-cc51e5",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-7adbea",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-8c0825",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-7803bf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-7b0ac7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-159d84",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190212Z-837f8d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-7fce32",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190212Z-0d79b7",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-4fc986",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b13b7f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-c08ede",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-b89751")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        