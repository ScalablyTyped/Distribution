organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-506c91"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-74a5ce",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-ad776a",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-0d1894",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-b9732a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "commander" % "2.19.0-b52167",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-9b4c64",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20190228Z-b6d29a",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-8d912a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-f2a81d",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-4a557f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-ded1c2",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-aa0890",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f5a31c",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-24c354",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-13267b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-5941ab",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-14fa71",
  "org.scalablytyped" %%% "moment" % "2.24.0-77c476",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190228Z-295efd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190303Z-ffcec9",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-d64d10",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b709fe",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-b3e118",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-bf9a54")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        