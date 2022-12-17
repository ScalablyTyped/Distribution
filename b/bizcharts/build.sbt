organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-1da29e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-317189",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-fff6fb",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-719aec",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-7ba1b3",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-cc7947",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-25ae1b",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-69d873",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-60f05e",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-45043f",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-ac0236",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-2a72f9",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-e3fb41",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-8a05d3",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-85e220",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-60bb8f",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-34b2cc",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-afcbd9",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e481a4",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5fc355",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8dc8db",
  "org.scalablytyped" %%% "inversify" % "6.0.1-d97ef7",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-9d09ea",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-9fd147",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-38d826",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
