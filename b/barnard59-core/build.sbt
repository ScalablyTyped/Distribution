organization := "org.scalablytyped"
name := "barnard59-core"
version := "1.0-dt-20220624Z-d02d84"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-5b8b46",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-f4e437",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-ffba73",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-36021b",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-14a7cf",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-b6a8d9",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-ef3cd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
