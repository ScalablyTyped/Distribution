organization := "org.scalablytyped"
name := "barnard59-base"
version := "1.0-dt-20220204Z-2ee13f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-e55fce",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-626634",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-eec4ba",
  "org.scalablytyped" %%% "logform" % "2.4.2-992aea",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-89825e",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-a4b9c7",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-8fd5fa",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-a12e40",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "winston" % "3.8.2-af2abd",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-b9d63a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
