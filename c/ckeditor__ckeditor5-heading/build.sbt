organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-heading"
version := "29.0-dt-20220624Z-9b8147"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "32.0-dt-20221114Z-7d24d8",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-paragraph" % "27.0-dt-20220624Z-c81486",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
