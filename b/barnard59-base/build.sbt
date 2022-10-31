organization := "org.scalablytyped"
name := "barnard59-base"
version := "1.0-dt-20220204Z-ddaea2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "barnard59-core" % "1.0-dt-20220624Z-5c207d",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-b12a02",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-3c7466",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-55ffce",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-7612eb",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-b0378a",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-14a7cf",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-34f3c6",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-0994d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
