organization := "org.scalablytyped"
name := "barnard59-core"
version := "1.0-dt-20221230Z-50134b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20230328Z-0c80cb",
  "org.scalablytyped" %%% "logform" % "2.5.1-81e6b7",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20221230Z-bae7af",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-3b406b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-02ca19",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-38d148",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "winston" % "3.8.2-1c5757",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-6b9169")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
