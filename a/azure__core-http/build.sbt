organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-432530"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-0f2022",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-40f364",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-f5360c",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-b4442d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-7a1ee2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
