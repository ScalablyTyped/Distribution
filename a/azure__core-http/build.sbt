organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-82b43a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-e508cb",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-0f0fa6",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-30b6c4",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-d8efb6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-6ec484")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
