organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20190128Z-4a57ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-61cc14",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-11ec61",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-eabe19",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-251790",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-a69dc5",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20180723Z-9d1f15",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-df7daf",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-0541e1",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "webdriver" % "5.4.9-54fd2d",
  "org.scalablytyped" %%% "webdriverio" % "5.4.9-2f8e0c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        