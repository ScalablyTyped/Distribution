organization := "org.scalablytyped"
name := "blueprintjs__datetime"
version := "3.20.0-568c9f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.36.0-aaa594",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.23.0-f8de17",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-47a880",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-e7f79e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-day-picker" % "7.4.8-f1402a",
  "org.scalablytyped" %%% "react-popper" % "2.2.4-cd8a79",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
