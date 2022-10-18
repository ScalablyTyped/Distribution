organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-7a201b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-7595af",
  "org.scalablytyped" %%% "antv__attr" % "0.3.3-6f8d69",
  "org.scalablytyped" %%% "antv__component" % "0.8.28-878eee",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-5fcd03",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-9befa3",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.11-f863f8",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-a2546e",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-426f9b",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-824fb5",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-fe9ef7",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-12ecf8",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-4bfd67",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-b9b308",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-62a637",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-3be824",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-7835cb",
  "org.scalablytyped" %%% "antv__scale" % "0.4.11-190742",
  "org.scalablytyped" %%% "antv__util" % "3.3.0-3c59b5",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-071b13",
  "org.scalablytyped" %%% "inversify" % "6.0.1-13e08a",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-adeb09",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-b26e7b",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-bb3273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
