organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-4b5867"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-157a7f",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-ec0f24",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-47af37",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-7d9e08",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-8a29c0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-76a079")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
