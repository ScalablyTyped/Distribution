organization := "org.scalablytyped"
name := "codemirror__language"
version := "6.2.1-b962fc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-9232d8",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-4cb7a3",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-429301",
  "org.scalablytyped" %%% "lezer__highlight" % "1.1.0-495bd7",
  "org.scalablytyped" %%% "lezer__lr" % "1.2.3-6db3dc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-322a64")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
