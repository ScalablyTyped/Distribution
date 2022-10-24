organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-heading"
version := "29.0-dt-20220624Z-67d619"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "32.0-dt-20220624Z-1c7f29",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-paragraph" % "27.0-dt-20220624Z-d96de1",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
