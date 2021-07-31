organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-caad62"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-54b5df",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20201002Z-e8991f",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-eba870",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-ccfe6c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
