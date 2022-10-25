organization := "org.scalablytyped"
name := "csv"
version := "6.2.0-e9a413"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csv-generate" % "4.2.0-33dd43",
  "org.scalablytyped" %%% "csv-parse" % "5.3.1-2305bb",
  "org.scalablytyped" %%% "csv-stringify" % "6.2.0-3432f0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-transform" % "3.2.0-e9796f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
