organization := "org.scalablytyped"
name := "azure__keyvault-keys"
version := "4.6.0-68ab6c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-e508cb",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-0f0fa6",
  "org.scalablytyped" %%% "azure__core-client" % "1.6.1-c4174b",
  "org.scalablytyped" %%% "azure__core-http-compat" % "1.3.0-49d8fc",
  "org.scalablytyped" %%% "azure__core-lro" % "2.3.1-968ec4",
  "org.scalablytyped" %%% "azure__core-paging" % "1.3.0-5ae394",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-4e4a94",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-30b6c4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-d8efb6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
