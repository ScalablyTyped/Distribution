organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.10.0-41d92b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-64f372",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-4a9357",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-508142",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-0eb6f9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-1b3ef2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-fbe073",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-8273af",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f5e410",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-f07668")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        