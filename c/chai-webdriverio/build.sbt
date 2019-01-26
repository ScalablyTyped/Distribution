organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20180214Z-dc2c5d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-48eeb6",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-ecde1e",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0051a6",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-15c6e1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-86c6a0",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20180723Z-4e5ad9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0bc71a",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-aa15d0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "webdriver" % "5.4.7-6eec2d",
  "org.scalablytyped" %%% "webdriverio" % "5.4.7-4811dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        