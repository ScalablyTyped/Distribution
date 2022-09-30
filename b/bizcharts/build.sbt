organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-b8f0a5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-75a3a7",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-809483",
  "org.scalablytyped" %%% "antv__component" % "0.8.32-68bf7c",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-872d3e",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-5e8d71",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-70abd9",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-94533f",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-b91685",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-5c03cc",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-00ce3d",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-c1f0ce",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-b22940",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-2c5af0",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-8c1f45",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-25c699",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-31cf8e",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-ea06f1",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-5161dd",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-b75196",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-0d1815",
  "org.scalablytyped" %%% "inversify" % "6.0.1-f39010",
  "org.scalablytyped" %%% "juggle__resize-observer" % "3.4.0-8cd195",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-12cfd9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-fdde97",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-49f5af",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-6b807c",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
