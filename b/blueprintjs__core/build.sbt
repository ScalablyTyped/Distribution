organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.10.0-4a4c9f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-a54f58",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-b84a90",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-36e706",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-1cc21f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-1d30a6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-503b6e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-dbe52f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-590f83",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-292246")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        