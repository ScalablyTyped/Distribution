organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-2aab1e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-ba3590",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-eb97b9",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-359aa5",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-a3ee68",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-06a07a",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-72c676",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-f4d1a0",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-110f87",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-7cdb3c",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-963e68",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-7ec951",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-5c786a",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-a6f1e9",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-f2ed8d",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-613f02",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-2d837d",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-c5f8ab",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e33eaa",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-0503e8",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-27ca14",
  "org.scalablytyped" %%% "inversify" % "6.0.1-f71ce0",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-dbc3f6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-3ab3c3",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-144517",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
