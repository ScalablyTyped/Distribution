organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-e291cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-14cd30",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-628a21",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-5d29f5",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-0c5342",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "commander" % "2.19.0-17acc3",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-d393b7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-031165",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-9f07a9",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-41ab3d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-881432",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-10d536",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-3fef18",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-9915c6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-af4dd0",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-304b78",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-91ddd3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-b4608a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-5b961a",
  "org.scalablytyped" %%% "moment" % "2.24.0-737009",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190228Z-67f717",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c50522",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190223Z-4b81ee",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-12ca1d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e769d0",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-b41bcf",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-6729f6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        