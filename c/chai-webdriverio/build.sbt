organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20190128Z-7d05ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-0a0732",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-57c0e7",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-781183",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-aa14b5",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20190214Z-28cd11",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190214Z-be54c4",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-e42fa8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ca6c55",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-d5b5f1",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "webdriver" % "5.7.8-1e5d52",
  "org.scalablytyped" %%% "webdriverio" % "5.7.8-4895d8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        