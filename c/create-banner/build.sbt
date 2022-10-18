organization := "org.scalablytyped"
name := "create-banner"
version := "2.0.0-3d04e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-d48b2a",
  "org.scalablytyped" %%% "read-pkg" % "7.1.0-d08fc9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-f509c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
