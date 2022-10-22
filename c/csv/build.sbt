organization := "org.scalablytyped"
name := "csv"
version := "6.2.0-db872a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csv-generate" % "4.2.0-3c916a",
  "org.scalablytyped" %%% "csv-parse" % "5.3.1-939b64",
  "org.scalablytyped" %%% "csv-stringify" % "6.2.0-deab79",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-transform" % "3.2.0-d858ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
