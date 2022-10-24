organization := "org.scalablytyped"
name := "csv"
version := "6.2.0-018106"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csv-generate" % "4.2.0-c16d8a",
  "org.scalablytyped" %%% "csv-parse" % "5.3.1-fb1ced",
  "org.scalablytyped" %%% "csv-stringify" % "6.2.0-d33c54",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-transform" % "3.2.0-22f2b5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
