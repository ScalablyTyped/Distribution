organization := "org.scalablytyped"
name := "csv"
version := "6.2.0-ca0039"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csv-generate" % "4.2.0-1fc13d",
  "org.scalablytyped" %%% "csv-parse" % "5.3.1-a6618a",
  "org.scalablytyped" %%% "csv-stringify" % "6.2.0-d5829d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-transform" % "3.2.0-2435cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
