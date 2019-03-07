organization := "org.scalablytyped"
name := "del"
version := "4.0.0-64ac48"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-26fb96",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-448338",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-57b73f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-24e045",
  "org.scalablytyped" %%% "globby" % "8.0-dt-20180614Z-14a69c",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2e5f61",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-5e711a",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-253e21",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-548674",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-493cc6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-72ef89",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-88109e",
  "org.scalablytyped" %%% "p-map" % "2.0.0-ab3a24",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-b223b7",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        