organization := "org.scalablytyped"
name := "builder-util"
version := "22.9.1-22ace8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-6ea3a1",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-939b6e",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20201111Z-c14307",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-b570cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
