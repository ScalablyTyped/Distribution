organization := "org.scalablytyped"
name := "complexviewer"
version := "2.1-dt-20211202Z-d71ba4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-604817",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-b48dde",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
