organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.10.0-ad9ada"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-8b7503",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "create-react-context" % "0.2.3-c42d7a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180910Z-659757",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-4cdde6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-93dab0",
  "org.scalablytyped" %%% "react-popper" % "1.3.0-8e5d46",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-671ec1",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f42599",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-67a080")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        