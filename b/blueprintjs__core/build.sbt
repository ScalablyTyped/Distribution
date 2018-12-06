organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.9.0-8d4ba3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.3.0-369c2c",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-a2824b",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-7e8f41",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-8df7a3",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-221490",
  "org.scalablytyped" %%% "react-popper" % "1.3.0-1a555b",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b0c8bc",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-7d74a3",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-5828e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        