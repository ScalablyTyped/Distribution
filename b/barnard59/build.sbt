organization := "org.scalablytyped"
name := "barnard59"
version := "1.0-dt-20221227Z-926a40"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20221230Z-52fe1b",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20230328Z-ab7f55",
  "org.scalablytyped" %%% "logform" % "2.5.1-81e6b7",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20221230Z-4f744e",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-5a0dcd",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-2dc0e2",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-38d148",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "winston" % "3.8.2-8faf0a",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-d22b58")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
