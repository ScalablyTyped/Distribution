organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.7.0-ba1b1f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.14.0-48628a",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-5e0c2a",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-2b6900",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-2cc11d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-c738b3",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-f5729c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-dfd109",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-e01cb1",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f660b8",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-c52a23",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-80eb49")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        