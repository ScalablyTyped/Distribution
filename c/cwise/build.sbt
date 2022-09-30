organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20211202Z-0f0780"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20211202Z-ce6dcb",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20211202Z-b40fa4",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20211202Z-43f34e",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
