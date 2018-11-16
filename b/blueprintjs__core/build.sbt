organization := "com.scalablytyped"
name := "blueprintjs__core"
version := "3.8.0-642556"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "blueprintjs__icons" % "3.3.0-228b56",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20181102Z-4c332c",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-d5f39a",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "dom4" % "v2.0-dt-20181102Z-e3d138",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.4-e6e20d",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "react-popper" % "1.0.2-2a2c86",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181102Z-338645",
  "com.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-0c9a0a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20181102Z-fa475f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        