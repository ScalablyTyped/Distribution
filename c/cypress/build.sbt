organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-dbd8f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-e77eb2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-61cc14",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-1c5f7c",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-6695f2",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "commander" % "2.19.0-131eaa",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-12aaf8",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-8530cb",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-9cd4f8",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-eabe19",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-e319be",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-71d823",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-00b149",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-0ebd09",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-f328ae",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-4c60fb",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-08d752",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-499315",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-cd42ab",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-552297",
  "org.scalablytyped" %%% "moment" % "2.24.0-cd7f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190109Z-86618e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-df7daf",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190125Z-3af1f2",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-e980ff",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-94c7e4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-29a25f",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-5b257b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        