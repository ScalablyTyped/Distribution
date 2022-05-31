organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20200515Z-fab361"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20200515Z-ef495a",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20200515Z-5aad43",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20200515Z-267704",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
