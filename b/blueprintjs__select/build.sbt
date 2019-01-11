organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.5.0-4b2878"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.11.0-e2691e",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.5.0-2ce038",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-fb7893",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-cd5d4c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-76e546",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-552d91",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-d0310f",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-ea48f9",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f7416b",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-fcf77f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        