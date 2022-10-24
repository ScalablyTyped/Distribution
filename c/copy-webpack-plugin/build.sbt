organization := "org.scalablytyped"
name := "copy-webpack-plugin"
version := "11.0.0-63d582"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-e75802",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-305d37",
  "org.scalablytyped" %%% "globby" % "13.1.2-6319f7",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-b40b4e",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-908e5e",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-292439",
  "org.scalablytyped" %%% "re2" % "1.17.7-9b0ba5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-807643",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-6f6163")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
