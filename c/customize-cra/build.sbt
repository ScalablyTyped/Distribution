organization := "org.scalablytyped"
name := "customize-cra"
version := "1.0-dt-20220815Z-4c4235"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-64302b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-21a261",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7a5e1e",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "webpack" % "5.75.0-5aadf4",
  "org.scalablytyped" %%% "webpack-bundle-analyzer" % "4.6-dt-20221005Z-e0e25e",
  "org.scalablytyped" %%% "workbox-webpack-plugin" % "5.1-dt-20211202Z-073923")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
