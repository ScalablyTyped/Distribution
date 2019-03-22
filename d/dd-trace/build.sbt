organization := "org.scalablytyped"
name := "dd-trace"
version := "0.10.2-448020"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "int64-buffer" % "0.1.10-913d06",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_kebabcase" % "4.1-dt-20190214Z-ad7cef",
  "org.scalablytyped" %%% "lodash_dot_memoize" % "4.1-dt-20190214Z-79a548",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190214Z-c28106",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190214Z-615acc",
  "org.scalablytyped" %%% "lodash_dot_truncate" % "4.4-dt-20190214Z-6166ae",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190214Z-bbbe9d",
  "org.scalablytyped" %%% "methods" % "1.1-dt-20180214Z-f4ea77",
  "org.scalablytyped" %%% "msgpack-lite" % "0.1-dt-20180214Z-8ad09d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d709de",
  "org.scalablytyped" %%% "opentracing" % "0.14.3-2108f9",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-b8d761",
  "org.scalablytyped" %%% "performance-now" % "2.1.0-ae8b5a",
  "org.scalablytyped" %%% "read-pkg-up" % "3.0-dt-20180214Z-719b45",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-b5df74",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "shimmer" % "1.x-dt-20180223Z-9d88ff",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-67cdec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        