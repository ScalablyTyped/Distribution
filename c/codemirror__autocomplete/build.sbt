organization := "org.scalablytyped"
name := "codemirror__autocomplete"
version := "6.2.0-03435d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "codemirror__state" % "6.1.1-034761",
  "org.scalablytyped" %%% "codemirror__view" % "6.2.4-cf5b64",
  "org.scalablytyped" %%% "lezer__common" % "1.0.1-5652ee",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "style-mod" % "4.0.0-0d5661")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
