organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-63c0c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-e508cb",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-0f0fa6",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-30b6c4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-d8efb6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-1918e0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
