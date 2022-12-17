organization := "org.scalablytyped"
name := "barnard59-validate-shacl"
version := "0.3-dt-20220117Z-cfd380"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-c60e56",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-74245e",
  "org.scalablytyped" %%% "logform" % "2.4.2-518243",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-0a47e0",
  "org.scalablytyped" %%% "rdf-validate-shacl" % "0.4-dt-20211202Z-17dc07",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-d396ff",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-9c930f",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-071889",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "winston" % "3.8.2-e286d5",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-7f49ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
