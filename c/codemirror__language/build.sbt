organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-c34469"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-2d3c83",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-1b7793",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-5950ef",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-3e7cad",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-c614f7",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-8f3e03")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
