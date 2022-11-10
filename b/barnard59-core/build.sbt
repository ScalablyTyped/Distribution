organization := "org.scalablytyped"
name := "barnard59-core"
version := "1.0-dt-20220624Z-90ddd3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-2fad5b",
  "org.scalablytyped" %%% "logform" % "2.4.2-3da3c1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-d92d3d",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-2458e7",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-2fd20b",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-99a251",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "winston" % "3.8.2-351d74",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-4a035e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
