organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20190128Z-b522f5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-1eef62",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-861aad",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-c97100",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-a19348",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-126e15",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20180723Z-b378fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-277b25",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-007aa4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "webdriver" % "5.4.13-a80c1b",
  "org.scalablytyped" %%% "webdriverio" % "5.4.13-ab7664")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        