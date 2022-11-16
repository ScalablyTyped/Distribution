organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-b09389"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20221103Z-2bd3ff",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-6154c2",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-1b34d7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
