organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-d1ca91"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-9ab5ef",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-463f58",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-2edbea",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-424fd8",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-3ba6c3",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-f3cbb0",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-b8bcbe",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-3324b0",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-7554f7",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-26eebe",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-b79101",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-fcd2e6",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-b2c29c",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-5a114a",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-f876fa",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-d12c33",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-83576e",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-e7bc47",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-3076aa",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-85a0f5",
  "org.scalablytyped" %%% "inversify" % "6.0.1-6db334",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-4331b0",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-096bcd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-9c07f9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-b37d9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
