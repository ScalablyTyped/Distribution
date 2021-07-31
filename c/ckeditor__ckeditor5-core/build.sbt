organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20201003Z-131b89"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200515Z-0bae8a",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20201003Z-a47946",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
