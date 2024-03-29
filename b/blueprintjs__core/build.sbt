organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "4.18.0-895fb0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.15.0-32e38f",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-5b023e",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.7-5886e9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-098677",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
