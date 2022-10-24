organization := "org.scalablytyped"
name := "barnard59-graph-store"
version := "1.0-dt-20211202Z-bb57cb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-899943",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-4310cd",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-14a7cf",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
