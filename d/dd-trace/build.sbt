organization := "org.scalablytyped"
name := "dd-trace"
version := "0.10.3-cab66a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-b198e9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190214Z-091aa1",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190214Z-a63ed0",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-22608d",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-87af72",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190214Z-dcd9fb",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190214Z-54f73c",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-322462",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-5894b1",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-326d93",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-a2a142",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-19b4b3",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-c6ba0e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-9da6ae",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-4d5163")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        