organization := "com.scalablytyped"
name := "cypress"
version := "3.1.2-9f4141"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-b74fe6",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-5ee5e8",
  "com.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-8fd2cb",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "check-more-types" % "2.24.0-cb8a7f",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "commander" % "2.19.0-17df09",
  "com.scalablytyped" %%% "common-tags" % "v1.4.0-dt-20180910Z-bda2b4",
  "com.scalablytyped" %%% "compare-versions" % "3.0-dt-20180910Z-dd054c",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-ae3b68",
  "com.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-f2b9c3",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-52b360",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2537fe",
  "com.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-419020",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b89aff",
  "com.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-032e5f",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-d287eb",
  "com.scalablytyped" %%% "lazy-ass" % "1.6.0-b337ba",
  "com.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-c65f4c",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-ee554d",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-591fed",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "ramda" % "0.25-dt-20181120Z-b95e9d",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-67a93f",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-d75ff9",
  "com.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181120Z-ac0966",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-7b9d49",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "com.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-3c9c53",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        