organization := "org.scalablytyped"
name := "copy-webpack-plugin"
version := "11.0.0-42dd16"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-7e3772",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-2f90b8",
  "org.scalablytyped" %%% "globby" % "13.1.2-a97c12",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fff97a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-cb64d6",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-dd01a0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-4f4518",
  "org.scalablytyped" %%% "re2" % "1.17.7-80a78e",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-635366",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-981407",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-6052b3",
  "org.scalablytyped" %%% "webpack" % "5.74.0-504ec9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
