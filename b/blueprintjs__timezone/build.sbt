organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.3.0-3bb904"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.13.0-f30054",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-6a864c",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.6.1-bb7269",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-7861df",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-48a94a",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-7c0ed3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-be5ab9",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-6fba4f",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-377c4e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-78bce0",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d5f303",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-6ba63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        