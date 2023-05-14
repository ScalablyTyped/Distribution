organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-697860"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-13e53f",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-049513",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-5b30d4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.4-2ccd1b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-cd1735")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
