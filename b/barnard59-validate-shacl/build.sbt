organization := "org.scalablytyped"
name := "barnard59-validate-shacl"
version := "0.3-dt-20220117Z-bad321"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-cac38f",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-ace018",
  "org.scalablytyped" %%% "logform" % "2.4.2-c14d43",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-5d4b3f",
  "org.scalablytyped" %%% "rdf-validate-shacl" % "0.4-dt-20211202Z-75e0ce",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-914e1b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-0586a2",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-70da70",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "winston" % "3.8.2-94a2eb",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-8f7803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
