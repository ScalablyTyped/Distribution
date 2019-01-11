organization := "org.scalablytyped"
name := "cypress"
version := "3.1.4-046c5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-45a61e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-0b0391",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-68f097",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-85aaa8",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "commander" % "2.19.0-69af0a",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-2b1fa6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-ccb9d8",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-0a92ad",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-3b29e8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-0dea14",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-445026",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d30f0",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-7352ec",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-d211b6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-b22ab3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fcc4b6",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-fe7cb3",
  "org.scalablytyped" %%% "moment" % "2.23.0-fd2546",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181231Z-310ebe",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181231Z-a4eb3a",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-67d662",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-0dd4e3",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-82b586")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        