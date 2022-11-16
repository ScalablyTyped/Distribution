organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-478271"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-f0e200",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-a9a8c2",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-a79a9a",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-9f633d",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-6d2b4a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-8ba6f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
