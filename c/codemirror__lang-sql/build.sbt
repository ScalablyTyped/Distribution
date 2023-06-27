organization := "org.scalablytyped"
name := "codemirror__lang-sql"
version := "6.5.0-221f66"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__autocomplete" % "6.7.1-9230bd",
  "org.scalablytyped" %%% "codemirror__language" % "6.7.0-3bbb6d",
  "org.scalablytyped" %%% "codemirror__state" % "6.2.1-e1b6a1",
  "org.scalablytyped" %%% "codemirror__view" % "6.13.0-66b654",
  "org.scalablytyped" %%% "lezer__common" % "1.0.3-48d8e4",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.6-430a2e",
  "org.scalablytyped" %%% "lezer__lr" % "1.3.5-f20c45",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "style-mod" % "4.0.3-2f2a4d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
