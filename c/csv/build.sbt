organization := "org.scalablytyped"
name := "csv"
version := "6.3.0-fa71dd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csv-generate" % "4.2.6-9cf454",
  "org.scalablytyped" %%% "csv-parse" % "5.3.10-7406b7",
  "org.scalablytyped" %%% "csv-stringify" % "6.4.0-b2e92c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "stream-transform" % "3.2.6-632a1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
