organization := "org.scalablytyped"
name := "cpy"
version := "7.2.0-53f38f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "2.0.1-d2905f",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "cp-file" % "6.2.0-97aa56",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-a8a63d",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-82ac81",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-95102e",
  "org.scalablytyped" %%% "globby" % "9.2.0-5c6ba3",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-d4d37d",
  "org.scalablytyped" %%% "ignore" % "4.0.6-56d479",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-4e6f4a",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-e3ba47",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-64a8b0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-e20010",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-87d30a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-bb1302",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-cc6aa4",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-a5cb3a",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        