organization := "org.scalablytyped"
name := "azure__opentelemetry-instrumentation-azure-sdk"
version := "1.0.0-beta.3-75bb03"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__logger" % "1.0.4-2ccd1b",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.4.1-453de8",
  "org.scalablytyped" %%% "opentelemetry__instrumentation" % "0.39.0-e7dda3",
  "org.scalablytyped" %%% "require-in-the-middle" % "7.1.0-1673bb",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
