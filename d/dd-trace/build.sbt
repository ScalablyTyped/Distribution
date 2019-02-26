organization := "org.scalablytyped"
name := "dd-trace"
version := "0.9.3-440119"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-88d465",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190212Z-61d26c",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190212Z-bd9115",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190212Z-98cf01",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190212Z-7840cb",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190212Z-ae7dcf",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190212Z-50dace",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-82f221",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-e62949",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-850695",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-b3130f",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-19ac33",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-7a6abe",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-4a6eb8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-dbae89",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-9318e8",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-6320a9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        