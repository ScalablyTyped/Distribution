organization := "org.scalablytyped"
name := "azure__core-client"
version := "1.6.1-2d738c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-2f508d",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-b2b01e",
  "org.scalablytyped" %%% "azure__core-rest-pipeline" % "1.9.2-0256c0",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-db6054",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-fb52b0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
