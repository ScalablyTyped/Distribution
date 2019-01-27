organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.3.0-7f10cf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.12.0-e16b81",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.5.1-42789c",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.6.0-1c4b12",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-85b28c",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-f491cb",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-65ef4f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-0d6824",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190126Z-a37585",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-931147",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-3390b1",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-28b11d",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-3dfab5",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-9bcf7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        