organization := "org.scalablytyped"
name := "barnard59-validate-shacl"
version := "0.3-dt-20220117Z-5ba169"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-aa175a",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-d42de5",
  "org.scalablytyped" %%% "logform" % "2.4.2-48c445",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-1a7449",
  "org.scalablytyped" %%% "rdf-validate-shacl" % "0.4-dt-20211202Z-867aad",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-392890",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-0d5150",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-d27b4a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "winston" % "3.8.2-9be0e7",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-a397dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
