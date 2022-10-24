organization := "org.scalablytyped"
name := "blueprintjs__table"
version := "4.7.4-badd0a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "4.11.4-3bcc8a",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.8.0-1a6b19",
  "org.scalablytyped" %%% "blueprintjs__popover2" % "1.7.4-1faf42",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-833116",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.6-735837",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-a12d8c",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
