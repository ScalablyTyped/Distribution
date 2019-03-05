organization := "org.scalablytyped"
name := "dd-trace"
version := "0.9.3-dfc59e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-41910b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190214Z-c7eb5e",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190214Z-cb77f0",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-f3e21b",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-5b20dd",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190214Z-5494d7",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190214Z-a42a64",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-513119",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-0e7e15",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-c130fb",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-cfda95",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-c64d8c",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-58e9ce",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-48035d",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-54a40f",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-72caa5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        