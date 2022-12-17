organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-393103"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20221103Z-efb7ba",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-aa4104",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-1e67f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
