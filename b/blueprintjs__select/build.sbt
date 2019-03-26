organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.7.0-20426b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.14.1-ddbc4d",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-800d23",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-43290b",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-274248",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20190322Z-510d7c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-f7bb7d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-1486a7",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-bcfacb",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a1e549",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-0765f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        