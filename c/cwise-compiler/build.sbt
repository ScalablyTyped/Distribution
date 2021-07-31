organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20200515Z-179676"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20200515Z-713eb7",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20200515Z-f821be",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
