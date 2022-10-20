organization := "org.scalablytyped"
name := "contentstack"
version := "3.15.4-32896b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "contentstack__utils" % "1.1.3-8921fc",
  "org.scalablytyped" %%% "css-select" % "5.1.0-661c34",
  "org.scalablytyped" %%% "css-what" % "6.1.0-08e82a",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-c87a1b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
