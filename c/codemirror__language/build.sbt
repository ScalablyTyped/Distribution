organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-1c74de"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-ffe678",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-6785fa",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-0ba8f2",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-88e7da",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-c793e4",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-263e31")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
