organization := "org.scalablytyped"
name := "azure__keyvault-keys"
version := "4.7.0-127c88"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-13e53f",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-049513",
  "org.scalablytyped" %%% "azure__core-client" % "1.7.2-9bdb95",
  "org.scalablytyped" %%% "azure__core-http-compat" % "2.0.1-1a89a8",
  "org.scalablytyped" %%% "azure__core-lro" % "2.5.3-07d454",
  "org.scalablytyped" %%% "azure__core-paging" % "1.5.0-da4b8d",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.10.3-6aa772",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-5b30d4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.4-2ccd1b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
