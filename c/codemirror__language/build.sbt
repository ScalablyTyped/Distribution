organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-9a7e15"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-890579",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-266e2b",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-ae3eb5",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-46627b",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-dbaf6c",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-1022a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
