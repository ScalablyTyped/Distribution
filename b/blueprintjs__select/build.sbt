organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.5.0-0315a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.11.0-079f7b",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.5.0-7945ab",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-9719bb",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-83ce64",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-d57ad1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-fdfa0a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-4533d5",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-454686",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-4811ae",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-abe80a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        