organization := "com.scalablytyped"
name := "cypress"
version := "3.1.0-591cdf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-f966e8",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-6f0d7d",
  "com.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-732ce2",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "check-more-types" % "2.24.0-a60bba",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "commander" % "2.19.0-3dc169",
  "com.scalablytyped" %%% "common-tags" % "v1.4.0-dt-20180910Z-0dfa1f",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-ad34a9",
  "com.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-9118d7",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-24b452",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-61412b",
  "com.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-7c1ff4",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-bb32bb",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-c6ff09",
  "com.scalablytyped" %%% "lazy-ass" % "1.6.0-4bfc36",
  "com.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-775578",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-5ebdd7",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-fc938a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-7d4659",
  "com.scalablytyped" %%% "ramda" % "0.25-dt-20181120Z-96bbd8",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-34d8d7",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-4fd1ec",
  "com.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181120Z-8302b8",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-99baa3",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-3d0dd8",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "com.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-f7931b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        