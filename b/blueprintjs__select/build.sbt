organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.4.0-37faab"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.10.0-394acb",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-c35b90",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-d403a0",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-05dfa3",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-6ab7dd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-a174c0",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-87c928",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-cbde35",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-bfad26",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-ce2f42")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        