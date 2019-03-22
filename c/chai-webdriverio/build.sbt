organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20190128Z-8d5063"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-bcb1b2",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-4b2fad",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-73fac2",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-9ffd11",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-739da4",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190214Z-0ebd83",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-04825d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-43680b",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-c0fad8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "webdriver" % "5.7.5-3b3013",
  "org.scalablytyped" %%% "webdriverio" % "5.7.5-6c3a89")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        