organization := "org.scalablytyped"
name := "blueprintjs__datetime"
version := "3.8.0-d4aec4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.15.0-62abf4",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.7.0-8991d6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-7b4635",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20190322Z-b69099",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-bbf92b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-day-picker" % "7.3.0-f98c11",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-9aa93f",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-f3cf56",
  "org.scalablytyped" %%% "react-transition-group" % "2.8-dt-20190404Z-861001",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d41765",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-34051e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        