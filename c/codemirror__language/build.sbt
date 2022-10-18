organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-95d955"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-4bac4b",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-ca31a2",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-74d6a4",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-f5de93",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-1d833a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-adeb52")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
