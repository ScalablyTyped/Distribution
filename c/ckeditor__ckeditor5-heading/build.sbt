organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-heading"
version := "29.0-dt-20220624Z-0159a0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "32.0-dt-20220624Z-650fab",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-paragraph" % "27.0-dt-20220624Z-dcd9e8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
