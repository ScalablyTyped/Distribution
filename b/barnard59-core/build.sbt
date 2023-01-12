organization := "org.scalablytyped"
name := "barnard59-core"
version := "1.0-dt-20220624Z-0242db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-f2e45e",
  "org.scalablytyped" %%% "logform" % "2.4.2-22d522",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-5740fd",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-171651",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-aeda03",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-250b5a",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "winston" % "3.8.2-208a98",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-af6604")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
