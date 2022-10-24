organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20211202Z-4dd28a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20211202Z-c32731",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20211202Z-01ba1c",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-444034",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
