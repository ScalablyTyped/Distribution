organization := "org.scalablytyped"
name := "cypress"
version := "3.1.3-393045"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180910Z-6e7d13",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-6866ba",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181109Z-d048af",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-ae73cc",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "commander" % "2.19.0-cf4cd1",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181208Z-f968ee",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180910Z-9e783b",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180910Z-1d8f20",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-a7959e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-f3b2ad",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180910Z-eaef43",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b7b8a8",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180910Z-c063b2",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181212Z-994342",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-fe726e",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180910Z-096215",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180910Z-8d8781",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-a86ad2",
  "org.scalablytyped" %%% "moment" % "2.23.0-1a181b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181208Z-cb2465",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-0007d0",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181213Z-3fca5e",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181213Z-79fbe0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-e1993c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180910Z-ad1ae5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        