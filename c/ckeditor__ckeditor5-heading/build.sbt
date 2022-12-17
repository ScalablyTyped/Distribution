organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-heading"
version := "29.0-dt-20220624Z-796f2c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "32.0-dt-20221114Z-43d380",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-paragraph" % "27.0-dt-20220624Z-287c01",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
