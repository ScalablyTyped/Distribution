organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "4.8.3-3c7490"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "4.11.3-66739c",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.7.0-efcce9",
  "org.scalablytyped" %%% "blueprintjs__popover2" % "1.7.3-4f98d3",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-f048b2",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.6-db4025",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-2a3260",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
