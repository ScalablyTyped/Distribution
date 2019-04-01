organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.8.0-349138"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.15.0-79e679",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.7.0-97ff47",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-9fc905",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-12f0fd",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20190322Z-b69099",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-a06ce6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-3be409",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-4c82dc",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-fc832a",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d41765",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-34051e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        