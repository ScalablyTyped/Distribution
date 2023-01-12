organization := "org.scalablytyped"
name := "azure__core-http-compat"
version := "1.3.0-e4c061"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-0f2022",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-40f364",
  "org.scalablytyped" %%% "azure__core-client" % "1.6.1-5ec9b2",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-dfab0e",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-f5360c",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-b4442d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
