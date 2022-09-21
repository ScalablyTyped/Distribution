organization := "org.scalablytyped"
name := "blueprintjs__table"
version := "4.6.7-f03e1d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "4.10.1-406da0",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.5.0-291fe9",
  "org.scalablytyped" %%% "blueprintjs__popover2" % "1.6.6-b67248",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "juggle__resize-observer" % "3.4.0-cec0ed",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-b3b55d",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.6-867cee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-96037a",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
