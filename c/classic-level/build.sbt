organization := "org.scalablytyped"
name := "classic-level"
version := "1.2.0-9f1ae4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-6ff08f",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-9e714b",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-a108f4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
