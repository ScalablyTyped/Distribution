organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-703da9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-1d5bdc",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-504e24",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-7cea2a",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-39c44f",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-e78575",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-988ebf",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-888e5d",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-4af5fe",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-4ca43c",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-6b5de8",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-74a93d",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-b47439",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-48b214",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-38495c",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-82dcc3",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-448412",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-bf370a",
  "org.scalablytyped" %%% "antv__util" % "3.3.1-3945ec",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-9a54c5",
  "org.scalablytyped" %%% "inversify" % "6.0.1-60a540",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-9a1d0d",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-334310",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-b82bc3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
