organization := "org.scalablytyped"
name := "cypress"
version := "3.1.4-d059c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-7d2cb6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-58aab1",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-016acb",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-ec2a0a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "commander" % "2.19.0-12e126",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-8c3a78",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-2e27cb",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-5e174d",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-15db9e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-2059c4",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-2fe24e",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-ec51da",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-99383f",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-6280d6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-6264f1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-25db68",
  "org.scalablytyped" %%% "moment" % "2.23.0-e5bac4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181231Z-fbecad",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181231Z-14c59a",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-988964",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-9e9c07",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-437282",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-d58715")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        