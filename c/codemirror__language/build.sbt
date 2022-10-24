organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-9776fb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-00f7ce",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-90bc8c",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-997f29",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-11edcc",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-f6af0f",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-e319f5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
