organization := "com.scalablytyped"
name := "blueprintjs__core"
version := "3.9.0-449aa0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "blueprintjs__icons" % "3.3.0-a37bd9",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-e558e0",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-97b9ed",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.6-6a8603",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0eb952",
  "com.scalablytyped" %%% "react-popper" % "1.3.0-4378ad",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-035397",
  "com.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-e52001",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-d608ff",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        