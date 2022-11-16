organization := "org.scalablytyped"
name := "azure__keyvault-keys"
version := "4.6.0-a4789b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-fbe239",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-b76c7d",
  "org.scalablytyped" %%% "azure__core-client" % "1.6.1-151eb6",
  "org.scalablytyped" %%% "azure__core-http-compat" % "1.3.0-d0f67f",
  "org.scalablytyped" %%% "azure__core-lro" % "2.3.1-9c8076",
  "org.scalablytyped" %%% "azure__core-paging" % "1.3.0-fd921d",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-cfb051",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-4611f8",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-fb52b0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
