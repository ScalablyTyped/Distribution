organization := "org.scalablytyped"
name := "copy-webpack-plugin"
version := "11.0.0-4eab1b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-1585cd",
  "org.scalablytyped" %%% "globby" % "13.1.2-f2b914",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-32f022",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-f685e3",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-7921e7",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-427ce3",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad807d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "webpack" % "5.75.0-18231e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
