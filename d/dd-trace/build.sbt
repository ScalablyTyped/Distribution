organization := "org.scalablytyped"
name := "dd-trace"
version := "0.9.3-53378d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-9b900f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190212Z-0460f4",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190212Z-24043a",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190212Z-aa72c4",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190212Z-d37718",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190212Z-a9cd09",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190212Z-65f0d8",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-5fbd50",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-dd5b0e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-0affdf",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-93d051",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-1c82be",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-4a074a",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-019b41",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4554d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-09f7e5",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-b07422")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        