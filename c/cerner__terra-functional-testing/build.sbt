organization := "org.scalablytyped"
name := "cerner__terra-functional-testing"
version := "2.5-dt-20211202Z-1c89ed"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axe-core" % "4.4.3-ad1505",
  "org.scalablytyped" %%% "mocha" % "10.0-dt-20220928Z-3f9d22",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
