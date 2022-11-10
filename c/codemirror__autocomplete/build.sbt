organization := "org.scalablytyped"
name := "codemirror__autocomplete"
version := "6.2.0-8648fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-2d3c83",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-1b7793",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-5950ef",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
