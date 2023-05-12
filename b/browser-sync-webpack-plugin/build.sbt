organization := "org.scalablytyped"
name := "browser-sync-webpack-plugin"
version := "2.2-dt-20211202Z-31de09"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-6bf940",
  "org.scalablytyped" %%% "anymatch" % "3.1.3-0a75c9",
  "org.scalablytyped" %%% "browser-sync" % "2.27-dt-20230320Z-73feca",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-83a7b5",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-c415ea",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-7ee530",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "re2" % "1.18.0-0ff8d6",
  "org.scalablytyped" %%% "schema-utils" % "4.0.1-eeb615",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20230223Z-85f1e2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b557e4",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272",
  "org.scalablytyped" %%% "webpack" % "5.82.1-fe40a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
