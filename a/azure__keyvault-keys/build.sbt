organization := "org.scalablytyped"
name := "azure__keyvault-keys"
version := "4.6.0-9f7299"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-1177bf",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-10c946",
  "org.scalablytyped" %%% "azure__core-client" % "1.6.1-005be4",
  "org.scalablytyped" %%% "azure__core-http-compat" % "1.3.0-99d6a0",
  "org.scalablytyped" %%% "azure__core-lro" % "2.3.1-3ac36f",
  "org.scalablytyped" %%% "azure__core-paging" % "1.3.0-caa8c9",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-5623a2",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-893c16",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-d8efb6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
