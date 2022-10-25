organization := "org.scalablytyped"
name := "barnard59"
version := "1.0-dt-20211202Z-5e41b1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-991a73",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-76da6f",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-5c1c37",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-572810",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-73d250",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-14a7cf",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-24546a",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-132333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
