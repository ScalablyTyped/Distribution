organization := "org.scalablytyped"
name := "azure__identity"
version := "3.2.0-f0c586"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-13e53f",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-049513",
  "org.scalablytyped" %%% "azure__core-client" % "1.7.2-e0438f",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.10.3-dbda5e",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-5b30d4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.4-2ccd1b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
