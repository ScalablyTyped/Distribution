organization := "com.scalablytyped"
name := "blueprintjs__core"
version := "3.8.0-29dcd3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "blueprintjs__icons" % "3.3.0-93cb81",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d7884f",
  "com.scalablytyped" %%% "create-react-context" % "0.2.3-cf5e37",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-3afd8c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.4-2c189a",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-44bb36",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181009Z-140611",
  "com.scalablytyped" %%% "react-popper" % "1.0.2-3b9aba",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-a01676",
  "com.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-b0d431",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-ab83dd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        