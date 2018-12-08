organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.10.0-c2a397"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-b9de7b",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-768e43",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-7e8f41",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-8df7a3",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c1bc9b",
  "org.scalablytyped" %%% "react-popper" % "1.3.0-0606af",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-f5a922",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-7d74a3",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-5828e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        