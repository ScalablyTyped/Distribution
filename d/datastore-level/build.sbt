organization := "org.scalablytyped"
name := "datastore-level"
version := "1.1-dt-20200909Z-aa42fe"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-de56b6",
  "org.scalablytyped" %%% "interface-datastore" % "1.0-dt-20200729Z-f544dd",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20201002Z-5fbe83",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
