organization := "org.scalablytyped"
name := "contentstack__utils"
version := "1.1.2-f8abe1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "css-select" % "5.1.0-661c34",
  "org.scalablytyped" %%% "css-what" % "6.1.0-08e82a",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-c87a1b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
