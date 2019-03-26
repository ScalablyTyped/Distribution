organization := "org.scalablytyped"
name := "dd-trace"
version := "0.10.2-867809"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-6e3dfb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190214Z-d01044",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190214Z-b9275e",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-b0b123",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-8678eb",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190214Z-3e6636",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190214Z-96e97a",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-a4aaa6",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-f9d0af",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-4bff31",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-4e0b5d",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-4011d8",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-0bf6fe",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-1d2a93",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-816092",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-13bbd4",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-d041e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        