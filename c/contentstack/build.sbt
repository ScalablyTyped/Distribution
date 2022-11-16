organization := "org.scalablytyped"
name := "contentstack"
version := "3.15.4-76bd62"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "contentstack__utils" % "1.1.3-2768f5",
  "org.scalablytyped" %%% "css-select" % "5.1.0-411a45",
  "org.scalablytyped" %%% "css-what" % "6.1.0-a04356",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-ef4ec1",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
