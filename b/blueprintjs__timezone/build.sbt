organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.3.0-e91c08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.14.1-551c66",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-87bff5",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.7.0-f87a25",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-3f1c68",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-0cf44b",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-0a5cd1",
  "org.scalablytyped" %%% "moment" % "2.24.0-77c476",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-15640a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-5852bc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-f7f3c1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-502e31",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-dd7242",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f7b141",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-361c07",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-d21fb1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        