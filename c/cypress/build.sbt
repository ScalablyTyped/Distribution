organization := "org.scalablytyped"
name := "cypress"
version := "3.1.4-8d4657"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-41858b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a8dc26",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-48eeb6",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-9bf914",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-cb0bef",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "commander" % "2.19.0-012a2c",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-5b87a3",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-a1b44b",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-c295a1",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0051a6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-3bc3c3",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-27f48c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-0b7a31",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-c77ed0",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-d1bfaf",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f7f24f",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-8aa310",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-55272e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-a1e856",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-6ddcc4",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190109Z-a1b802",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0bc71a",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190117Z-270deb",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-d3a04a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b20ceb",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-1a3415",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-495a35")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        