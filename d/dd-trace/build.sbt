organization := "org.scalablytyped"
name := "dd-trace"
version := "0.10.3-8ddaab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-a304da",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190214Z-d1660d",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190214Z-5a2d53",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-e100a4",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-273079",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190214Z-454d59",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190214Z-2e4661",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-322462",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-1ea009",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-326d93",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-a2a142",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-c6ba0e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-32e430",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-9da6ae",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-4d5163")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        