organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-c254c4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-acbfae",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20221103Z-eb66ee",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-382710",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-03309d",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
