organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.2.0-df40f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.11.0-f62090",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.5.0-42789c",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.5.0-9831ea",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-26d84c",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-f491cb",
  "org.scalablytyped" %%% "moment" % "2.23.0-3073eb",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-d29173",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-0d6824",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-99d6f9",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-069557",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-3a0a19",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-3dfab5",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-9bcf7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        