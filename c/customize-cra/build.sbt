organization := "org.scalablytyped"
name := "customize-cra"
version := "1.0-dt-20220815Z-a90d55"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5ca42e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-82c4da",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-5dfb0f",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-5100e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-427ce3",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad807d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "webpack" % "5.75.0-18231e",
  "org.scalablytyped" %%% "webpack-bundle-analyzer" % "4.6-dt-20221005Z-bd258c",
  "org.scalablytyped" %%% "workbox-webpack-plugin" % "5.1-dt-20211202Z-52e28e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
