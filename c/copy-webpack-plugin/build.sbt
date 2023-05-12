organization := "org.scalablytyped"
name := "copy-webpack-plugin"
version := "11.0.0-cbc754"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-6bf940",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-57d988",
  "org.scalablytyped" %%% "globby" % "13.1.4-98669b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-061a78",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-b05c2d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-ee433a",
  "org.scalablytyped" %%% "re2" % "1.18.0-0ff8d6",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-eeb615",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "webpack" % "5.82.1-fe40a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
