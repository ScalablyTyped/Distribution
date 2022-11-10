organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20211202Z-836def"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20211202Z-4c5bf0",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-ada2b9",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
