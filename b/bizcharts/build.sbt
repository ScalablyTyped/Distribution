organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-fe01ae"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-d52ba6",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-853706",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-056271",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-94bd60",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-f7c344",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-887b3f",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-b755f1",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-9325ab",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-59cd18",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-213dc8",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-798cb5",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-1b7b3b",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-86fcf2",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-1c9e38",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-14b629",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-c32553",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-1eb0a8",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-73b2ea",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5bff7d",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8ec21e",
  "org.scalablytyped" %%% "inversify" % "6.0.1-d4bb21",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-b815ac",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-00e49d",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-8ec86b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
