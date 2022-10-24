organization := "org.scalablytyped"
name := "barnard59"
version := "1.0-dt-20211202Z-d96d7a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-a3ac61",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-368f64",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-37c5de",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-899943",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-4310cd",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-14a7cf",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-ca81e6",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-4de3a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
