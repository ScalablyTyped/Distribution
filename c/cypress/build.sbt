organization := "org.scalablytyped"
name := "cypress"
version := "3.1.4-8f5e0c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-fbb676",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-db823b",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-917d72",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b06515",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-c90072",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "commander" % "2.19.0-30fe69",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-fe0edb",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-f33132",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-30f5ab",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-31009f",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-cf8243",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-af4281",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-174463",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d3df4",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-33d406",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-e91c8c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-142b1b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-8f06e9",
  "org.scalablytyped" %%% "moment" % "2.23.0-9a5931",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181231Z-e96e31",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181231Z-67301c",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-1d6b0e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-f7ab30",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-2bceff",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20180226Z-d20fef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        