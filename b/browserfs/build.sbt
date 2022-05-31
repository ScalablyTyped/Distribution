organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-8b0e95"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-99410f",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20201002Z-83ac43",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-bd3055",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-d98900",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
