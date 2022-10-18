organization := "org.scalablytyped"
name := "barnard59-core"
version := "1.0-dt-20220624Z-0f51da"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-b9f6a4",
  "org.scalablytyped" %%% "logform" % "2.4.2-8544ea",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-9e86da",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-82a29b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-c22c87",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-823b4d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "winston" % "3.8.2-916fd5",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-74ff67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
