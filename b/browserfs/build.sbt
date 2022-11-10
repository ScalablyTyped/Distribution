organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-e69959"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-bfb740",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20221103Z-ac8fb2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-1f230b",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-bd910a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
