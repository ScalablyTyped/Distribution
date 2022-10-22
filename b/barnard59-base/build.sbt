organization := "org.scalablytyped"
name := "barnard59-base"
version := "1.0-dt-20220204Z-857ac1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-0c23d4",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-3b67c3",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-3cb2e2",
  "org.scalablytyped" %%% "logform" % "2.4.2-8544ea",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-0ed2fc",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-8f6934",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-fe777d",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-823b4d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "winston" % "3.8.2-0750b3",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-269b93")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
