organization := "org.scalablytyped"
name := "azure__keyvault-keys"
version := "4.6.0-66499f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-4f35ea",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-832d7d",
  "org.scalablytyped" %%% "azure__core-client" % "1.6.1-d8e732",
  "org.scalablytyped" %%% "azure__core-http-compat" % "1.3.0-b7212f",
  "org.scalablytyped" %%% "azure__core-lro" % "2.3.1-6654e8",
  "org.scalablytyped" %%% "azure__core-paging" % "1.3.0-0d71f5",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-bf5d7e",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-a23c51",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-be6f9a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
