organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.10.0-cefd99"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-41ee7c",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-fae7dc",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-d854b2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-fbe2cc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-popper" % "1.3.0-a9f819",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-65045f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-36069e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-529c30")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        